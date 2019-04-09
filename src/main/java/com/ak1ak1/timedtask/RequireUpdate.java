package com.ak1ak1.timedtask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import com.ak1ak1.mapper.mapper1.OutStockMapper;
import com.ak1ak1.mapper.mapper2.GresaSaDtlMapper;
import com.ak1ak1.mapper.mapper2.PubGoodsKsMapper;
import com.ak1ak1.mapper.mapper2.PubGoodsMapper;
import com.ak1ak1.mapper.mapper2.RecipeAllotMapper;
import com.ak1ak1.pojo.GresaSaDtl;
import com.ak1ak1.pojo.OutStock;
import com.ak1ak1.pojo.PubGoods;
import com.ak1ak1.pojo.PubGoodsKs;
import com.ak1ak1.pojo.RecipeAllot;

import tk.mybatis.mapper.entity.Example;


@Configuration
@Component
@EnableScheduling
public class RequireUpdate {

	@Resource
	private GresaSaDtlMapper gresaSaDtlMapper;
	
	@Resource
	private OutStockMapper outStockMapper;
	
	@Resource
	private PubGoodsMapper pubGoodsMapper;
	
	@Resource
	private RecipeAllotMapper recipeAllotMapper;
	
	@Resource
	private PubGoodsKsMapper pubGoodsKsMapper;
	
	/**
	 * @Description 
	 * @author 何杰
	 * @date 2019年1月28日
	 */
	public void update(){
		Integer limit = 10;
		while(true){
			List<GresaSaDtl> gresaSaDtls = gresaSaDtlMapper.getGresaSaDtlsList(limit - 10,limit);
			for (GresaSaDtl gresaSaDtl : gresaSaDtls) {
				String memo = gresaSaDtl.getMemo();
				if(StringUtils.isNotBlank(memo)){
					String orderCode = memo.replace("电商订单生成零售细单，订单编号", "");
					List<OutStock> outStocks = outStockMapper.getOutStockListByOutstockNo(orderCode);
					// 只设置姓名
					for (OutStock outStock : outStocks) {
						gresaSaDtl.setPatient(outStock.getConsignee());
						gresaSaDtl.setZx_telephonenumber(outStock.getContact());
					}
					if(outStocks != null && outStocks.size() > 0){
						// 先匹配科室，在匹配疾病
						// 查询药品 设置 医生姓名，医院
						PubGoods pubGoods = pubGoodsMapper.getPubGoogs(gresaSaDtl.getGoodsid());
						if(pubGoods != null){
							boolean matches = Pattern.matches("\\d+",pubGoods.getKs());
							if(matches){
								PubGoodsKs pubGoodsKs = pubGoodsKsMapper.selectByPrimaryKey(pubGoods.getKs());
								if(pubGoodsKs != null){
									// 跟库药品科室匹配
									Example queryKs = new Example(RecipeAllot.class);
									queryKs.createCriteria().andLike("ks", "%" + pubGoodsKs.getKsname() + "%");
									// 根据药品查出科室相关的医生
									List<RecipeAllot> raKss = recipeAllotMapper.selectByExample(queryKs);
									if(raKss != null && raKss.size() > 0){
										/*
										 * 妇科，妇产科 为女
										 * 男科 为男
										 * 年龄为18-60周岁
										 * 
										 * 肿瘤科 如果是乳腺癌性别为女其余设置为男
										 * 
										 */
										if(StringUtils.isNotBlank(pubGoods.getKs())){
											// 设置性别 包含妇和乳为女
											if(pubGoodsKs.getKsname().contains("妇") || pubGoodsKs.getKsname().contains("乳")){
												gresaSaDtl.setPatientsex("女");
												gresaSaDtl.setPatientage(new Random().nextInt(60 - 18 + 1) + 18L);
											}else{
												gresaSaDtl.setPatientsex("男");
											}
											
											// 设置年龄 肿瘤年龄段18-70
											if(pubGoodsKs.getKsname().contains("肿瘤")){
												gresaSaDtl.setPatientage(new Random().nextInt(70 - 18 + 1) + 18L);
											}else{
												gresaSaDtl.setPatientage(new Random().nextInt(60 - 18 + 1) + 18L);
											}
											// 随机索引
											int random = new Random().nextInt(raKss.size());
											
											// 设置医院
											gresaSaDtl.setRecipehospital(raKss.get(random).getHospital());
											// 设置医生名字
											gresaSaDtl.setRecipedoctor(raKss.get(random).getName());
											/*if(StringUtils.isNotBlank(ra.getIllness())){
											String[] diseases = ra.getIllness().split("、");
											// 遍历主治医师治疗的疾病
											for (String disease : diseases) {
												// 匹配主治医师是否治疗该药品包含的疾病
												if(StringUtils.isNotBlank(pubGoods.getZx_sms_syz())){
													if(pubGoods.getZx_sms_syz().contains(disease)){
														System.out.println("医师   " + ra.getName() + "   主治：" + ra.getIllness());
														continue a;
													}
												}
											}
										}*/
										}
									}
									// 更新
									gresaSaDtlMapper.updateByPrimaryKeySelective(gresaSaDtl);
								}
							}
						}
					}
				}
			}
			limit += 10;
			if(gresaSaDtls == null || gresaSaDtls.size() == 0){
				break;
			}
		}
		System.out.println("当前时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		System.out.println("==============================更新完毕！==============================");
	}
	
}

package com.ak1ak1.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="pub_goods")
public class PubGoods {

	@Id
	private String goodsid;
	private String opcode;
	private String goodspinyin;
	private String goodsname;
	private String currencyname;
	private String goodsengname;
	private String goodsinvname;
	private String goodsshortname;
	private String goodsformalname;
	private String goodsformalpy;
	private String goodsno;
	private String standardno;
	private String barcode;
	private String goodstype;
	private String goodsunit;
	private String firstapprovedocno;
	private String approvedocno;
	private String registdocno;
	private String standardtype;
	private String factoryid;
	private String validperiod;
	private String respperiod;
	private String periodunit;
	private String trademark;
	private String prodarea;
	private String supplytaxrate;
	private String salestaxrate;
	private String fixpricetype;
	private String accflag;
	private String defaultagtflag;
	private String storagecondition;
	private String transcondition;
	private String combinflag;
	private String customstax;
	private String minreqgoodsqty;
	private String financeno;
	private String otcflag;
	private String securityflag;
	private String chineseflag;
	private String medicinetype;
	private String importflag;
	private String medicineflag;
	private String credate;
	private String inputmanid;
	private String memo;
	private String usestatus;
	private String nmrmsclassid;
	private String price;
	private String busiscope;
	private String boxflag;
	private String integernx;
	private String function;
	private String againchkflag;
	private String medicinesort;
	private String limitedsaleflag;
	private String leastsaleqty;
	private String entryset;
	private String financeno2;
	private String gspflag;
	private String ecodeflag;
	private String zhl;
	private String goodsgroupcode;
	private String mpgid;
	private String drugtaboo;
	private String goodsproperties;
	private String gspcategoryid;
	private String qlogid;
	private String pkid;
	private String direction;
	private String tranflag;
	private String trandate;
	private String exportdate;
	private String importdate;
	private String sys_modifydate;
	private String initflag;
	private String newgoodsid;
	private String varietyid;
	private String alonepackflag;
	private String medicinetypename;
	private String busiscopename;
	private String keysphyconservedays;
	private String specialdrug;
	private String coldflag;
	private String temperaturedown;
	private String temperatureup;
	private String specialctrl;
	private String transporttime;
	private String treatment;
	private String dosage;
	private String permitno;
	private String towmsdate;
	private String usetype;
	private String packname;
	private String packsize;
	private String ks;
	private String jylb;
	private String employeename;
	private String employeeid;
	private String diagnosticinfo;
	private String usegoodstime;
	private String zx_goodstype;
	private String zx_ypbm;
	private String zx_mainuseway;
	private String zx_mainstructure;
	private String zx_usescope;
	private String zx_rate;
	private String zx_measureunit;
	private String zx_dszt;
	private String filecount;
	private String zx_bpt;
	private String zx_ysbpt;
	private String zx_tolsdate;
	private String zx_arrival_time;
	private String zx_sms_cf;
	private String zx_sms_xz;
	private String zx_sms_syz;
	private String zx_sms_blfy;
	private String zx_sms_jj;
	private String zx_sms_jg;
	private String zx_sms_zysx;
	private String zx_sms_fnyy;
	private String zx_sms_etyy;
	private String zx_sms_lnyy;
	private String zx_sms_ywzy;
	private String zx_sms_ywgl;
	private String zx_sms_ywdl;
	private String zx_sms_yddl;
	private String zx_validperiod;
	private String zx_periodunit;
	private String zx_channel;
	private String zx_properties;
	private String zx_busiscopename1;
	private String zx_busiscopename2;
	private String zx_busiscopename3;
	private String zx_busiscopename4;
	
	
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getOpcode() {
		return opcode;
	}
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}
	public String getGoodspinyin() {
		return goodspinyin;
	}
	public void setGoodspinyin(String goodspinyin) {
		this.goodspinyin = goodspinyin;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getCurrencyname() {
		return currencyname;
	}
	public void setCurrencyname(String currencyname) {
		this.currencyname = currencyname;
	}
	public String getGoodsengname() {
		return goodsengname;
	}
	public void setGoodsengname(String goodsengname) {
		this.goodsengname = goodsengname;
	}
	public String getGoodsinvname() {
		return goodsinvname;
	}
	public void setGoodsinvname(String goodsinvname) {
		this.goodsinvname = goodsinvname;
	}
	public String getGoodsshortname() {
		return goodsshortname;
	}
	public void setGoodsshortname(String goodsshortname) {
		this.goodsshortname = goodsshortname;
	}
	public String getGoodsformalname() {
		return goodsformalname;
	}
	public void setGoodsformalname(String goodsformalname) {
		this.goodsformalname = goodsformalname;
	}
	public String getGoodsformalpy() {
		return goodsformalpy;
	}
	public void setGoodsformalpy(String goodsformalpy) {
		this.goodsformalpy = goodsformalpy;
	}
	public String getGoodsno() {
		return goodsno;
	}
	public void setGoodsno(String goodsno) {
		this.goodsno = goodsno;
	}
	public String getStandardno() {
		return standardno;
	}
	public void setStandardno(String standardno) {
		this.standardno = standardno;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(String goodstype) {
		this.goodstype = goodstype;
	}
	public String getGoodsunit() {
		return goodsunit;
	}
	public void setGoodsunit(String goodsunit) {
		this.goodsunit = goodsunit;
	}
	public String getFirstapprovedocno() {
		return firstapprovedocno;
	}
	public void setFirstapprovedocno(String firstapprovedocno) {
		this.firstapprovedocno = firstapprovedocno;
	}
	public String getApprovedocno() {
		return approvedocno;
	}
	public void setApprovedocno(String approvedocno) {
		this.approvedocno = approvedocno;
	}
	public String getRegistdocno() {
		return registdocno;
	}
	public void setRegistdocno(String registdocno) {
		this.registdocno = registdocno;
	}
	public String getStandardtype() {
		return standardtype;
	}
	public void setStandardtype(String standardtype) {
		this.standardtype = standardtype;
	}
	public String getFactoryid() {
		return factoryid;
	}
	public void setFactoryid(String factoryid) {
		this.factoryid = factoryid;
	}
	public String getValidperiod() {
		return validperiod;
	}
	public void setValidperiod(String validperiod) {
		this.validperiod = validperiod;
	}
	public String getRespperiod() {
		return respperiod;
	}
	public void setRespperiod(String respperiod) {
		this.respperiod = respperiod;
	}
	public String getPeriodunit() {
		return periodunit;
	}
	public void setPeriodunit(String periodunit) {
		this.periodunit = periodunit;
	}
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public String getProdarea() {
		return prodarea;
	}
	public void setProdarea(String prodarea) {
		this.prodarea = prodarea;
	}
	public String getSupplytaxrate() {
		return supplytaxrate;
	}
	public void setSupplytaxrate(String supplytaxrate) {
		this.supplytaxrate = supplytaxrate;
	}
	public String getSalestaxrate() {
		return salestaxrate;
	}
	public void setSalestaxrate(String salestaxrate) {
		this.salestaxrate = salestaxrate;
	}
	public String getFixpricetype() {
		return fixpricetype;
	}
	public void setFixpricetype(String fixpricetype) {
		this.fixpricetype = fixpricetype;
	}
	public String getAccflag() {
		return accflag;
	}
	public void setAccflag(String accflag) {
		this.accflag = accflag;
	}
	public String getDefaultagtflag() {
		return defaultagtflag;
	}
	public void setDefaultagtflag(String defaultagtflag) {
		this.defaultagtflag = defaultagtflag;
	}
	public String getStoragecondition() {
		return storagecondition;
	}
	public void setStoragecondition(String storagecondition) {
		this.storagecondition = storagecondition;
	}
	public String getTranscondition() {
		return transcondition;
	}
	public void setTranscondition(String transcondition) {
		this.transcondition = transcondition;
	}
	public String getCombinflag() {
		return combinflag;
	}
	public void setCombinflag(String combinflag) {
		this.combinflag = combinflag;
	}
	public String getCustomstax() {
		return customstax;
	}
	public void setCustomstax(String customstax) {
		this.customstax = customstax;
	}
	public String getMinreqgoodsqty() {
		return minreqgoodsqty;
	}
	public void setMinreqgoodsqty(String minreqgoodsqty) {
		this.minreqgoodsqty = minreqgoodsqty;
	}
	public String getFinanceno() {
		return financeno;
	}
	public void setFinanceno(String financeno) {
		this.financeno = financeno;
	}
	public String getOtcflag() {
		return otcflag;
	}
	public void setOtcflag(String otcflag) {
		this.otcflag = otcflag;
	}
	public String getSecurityflag() {
		return securityflag;
	}
	public void setSecurityflag(String securityflag) {
		this.securityflag = securityflag;
	}
	public String getChineseflag() {
		return chineseflag;
	}
	public void setChineseflag(String chineseflag) {
		this.chineseflag = chineseflag;
	}
	public String getMedicinetype() {
		return medicinetype;
	}
	public void setMedicinetype(String medicinetype) {
		this.medicinetype = medicinetype;
	}
	public String getImportflag() {
		return importflag;
	}
	public void setImportflag(String importflag) {
		this.importflag = importflag;
	}
	public String getMedicineflag() {
		return medicineflag;
	}
	public void setMedicineflag(String medicineflag) {
		this.medicineflag = medicineflag;
	}
	public String getCredate() {
		return credate;
	}
	public void setCredate(String credate) {
		this.credate = credate;
	}
	public String getInputmanid() {
		return inputmanid;
	}
	public void setInputmanid(String inputmanid) {
		this.inputmanid = inputmanid;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getUsestatus() {
		return usestatus;
	}
	public void setUsestatus(String usestatus) {
		this.usestatus = usestatus;
	}
	public String getNmrmsclassid() {
		return nmrmsclassid;
	}
	public void setNmrmsclassid(String nmrmsclassid) {
		this.nmrmsclassid = nmrmsclassid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBusiscope() {
		return busiscope;
	}
	public void setBusiscope(String busiscope) {
		this.busiscope = busiscope;
	}
	public String getBoxflag() {
		return boxflag;
	}
	public void setBoxflag(String boxflag) {
		this.boxflag = boxflag;
	}
	public String getIntegernx() {
		return integernx;
	}
	public void setIntegernx(String integernx) {
		this.integernx = integernx;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getAgainchkflag() {
		return againchkflag;
	}
	public void setAgainchkflag(String againchkflag) {
		this.againchkflag = againchkflag;
	}
	public String getMedicinesort() {
		return medicinesort;
	}
	public void setMedicinesort(String medicinesort) {
		this.medicinesort = medicinesort;
	}
	public String getLimitedsaleflag() {
		return limitedsaleflag;
	}
	public void setLimitedsaleflag(String limitedsaleflag) {
		this.limitedsaleflag = limitedsaleflag;
	}
	public String getLeastsaleqty() {
		return leastsaleqty;
	}
	public void setLeastsaleqty(String leastsaleqty) {
		this.leastsaleqty = leastsaleqty;
	}
	public String getEntryset() {
		return entryset;
	}
	public void setEntryset(String entryset) {
		this.entryset = entryset;
	}
	public String getFinanceno2() {
		return financeno2;
	}
	public void setFinanceno2(String financeno2) {
		this.financeno2 = financeno2;
	}
	public String getGspflag() {
		return gspflag;
	}
	public void setGspflag(String gspflag) {
		this.gspflag = gspflag;
	}
	public String getEcodeflag() {
		return ecodeflag;
	}
	public void setEcodeflag(String ecodeflag) {
		this.ecodeflag = ecodeflag;
	}
	public String getZhl() {
		return zhl;
	}
	public void setZhl(String zhl) {
		this.zhl = zhl;
	}
	public String getGoodsgroupcode() {
		return goodsgroupcode;
	}
	public void setGoodsgroupcode(String goodsgroupcode) {
		this.goodsgroupcode = goodsgroupcode;
	}
	public String getMpgid() {
		return mpgid;
	}
	public void setMpgid(String mpgid) {
		this.mpgid = mpgid;
	}
	public String getDrugtaboo() {
		return drugtaboo;
	}
	public void setDrugtaboo(String drugtaboo) {
		this.drugtaboo = drugtaboo;
	}
	public String getGoodsproperties() {
		return goodsproperties;
	}
	public void setGoodsproperties(String goodsproperties) {
		this.goodsproperties = goodsproperties;
	}
	public String getGspcategoryid() {
		return gspcategoryid;
	}
	public void setGspcategoryid(String gspcategoryid) {
		this.gspcategoryid = gspcategoryid;
	}
	public String getQlogid() {
		return qlogid;
	}
	public void setQlogid(String qlogid) {
		this.qlogid = qlogid;
	}
	public String getPkid() {
		return pkid;
	}
	public void setPkid(String pkid) {
		this.pkid = pkid;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getTranflag() {
		return tranflag;
	}
	public void setTranflag(String tranflag) {
		this.tranflag = tranflag;
	}
	public String getTrandate() {
		return trandate;
	}
	public void setTrandate(String trandate) {
		this.trandate = trandate;
	}
	public String getExportdate() {
		return exportdate;
	}
	public void setExportdate(String exportdate) {
		this.exportdate = exportdate;
	}
	public String getImportdate() {
		return importdate;
	}
	public void setImportdate(String importdate) {
		this.importdate = importdate;
	}
	public String getSys_modifydate() {
		return sys_modifydate;
	}
	public void setSys_modifydate(String sys_modifydate) {
		this.sys_modifydate = sys_modifydate;
	}
	public String getInitflag() {
		return initflag;
	}
	public void setInitflag(String initflag) {
		this.initflag = initflag;
	}
	public String getNewgoodsid() {
		return newgoodsid;
	}
	public void setNewgoodsid(String newgoodsid) {
		this.newgoodsid = newgoodsid;
	}
	public String getVarietyid() {
		return varietyid;
	}
	public void setVarietyid(String varietyid) {
		this.varietyid = varietyid;
	}
	public String getAlonepackflag() {
		return alonepackflag;
	}
	public void setAlonepackflag(String alonepackflag) {
		this.alonepackflag = alonepackflag;
	}
	public String getMedicinetypename() {
		return medicinetypename;
	}
	public void setMedicinetypename(String medicinetypename) {
		this.medicinetypename = medicinetypename;
	}
	public String getBusiscopename() {
		return busiscopename;
	}
	public void setBusiscopename(String busiscopename) {
		this.busiscopename = busiscopename;
	}
	public String getKeysphyconservedays() {
		return keysphyconservedays;
	}
	public void setKeysphyconservedays(String keysphyconservedays) {
		this.keysphyconservedays = keysphyconservedays;
	}
	public String getSpecialdrug() {
		return specialdrug;
	}
	public void setSpecialdrug(String specialdrug) {
		this.specialdrug = specialdrug;
	}
	public String getColdflag() {
		return coldflag;
	}
	public void setColdflag(String coldflag) {
		this.coldflag = coldflag;
	}
	public String getTemperaturedown() {
		return temperaturedown;
	}
	public void setTemperaturedown(String temperaturedown) {
		this.temperaturedown = temperaturedown;
	}
	public String getTemperatureup() {
		return temperatureup;
	}
	public void setTemperatureup(String temperatureup) {
		this.temperatureup = temperatureup;
	}
	public String getSpecialctrl() {
		return specialctrl;
	}
	public void setSpecialctrl(String specialctrl) {
		this.specialctrl = specialctrl;
	}
	public String getTransporttime() {
		return transporttime;
	}
	public void setTransporttime(String transporttime) {
		this.transporttime = transporttime;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getPermitno() {
		return permitno;
	}
	public void setPermitno(String permitno) {
		this.permitno = permitno;
	}
	public String getTowmsdate() {
		return towmsdate;
	}
	public void setTowmsdate(String towmsdate) {
		this.towmsdate = towmsdate;
	}
	public String getUsetype() {
		return usetype;
	}
	public void setUsetype(String usetype) {
		this.usetype = usetype;
	}
	public String getPackname() {
		return packname;
	}
	public void setPackname(String packname) {
		this.packname = packname;
	}
	public String getPacksize() {
		return packsize;
	}
	public void setPacksize(String packsize) {
		this.packsize = packsize;
	}
	public String getKs() {
		return ks;
	}
	public void setKs(String ks) {
		this.ks = ks;
	}
	public String getJylb() {
		return jylb;
	}
	public void setJylb(String jylb) {
		this.jylb = jylb;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getDiagnosticinfo() {
		return diagnosticinfo;
	}
	public void setDiagnosticinfo(String diagnosticinfo) {
		this.diagnosticinfo = diagnosticinfo;
	}
	public String getUsegoodstime() {
		return usegoodstime;
	}
	public void setUsegoodstime(String usegoodstime) {
		this.usegoodstime = usegoodstime;
	}
	public String getZx_goodstype() {
		return zx_goodstype;
	}
	public void setZx_goodstype(String zx_goodstype) {
		this.zx_goodstype = zx_goodstype;
	}
	public String getZx_ypbm() {
		return zx_ypbm;
	}
	public void setZx_ypbm(String zx_ypbm) {
		this.zx_ypbm = zx_ypbm;
	}
	public String getZx_mainuseway() {
		return zx_mainuseway;
	}
	public void setZx_mainuseway(String zx_mainuseway) {
		this.zx_mainuseway = zx_mainuseway;
	}
	public String getZx_mainstructure() {
		return zx_mainstructure;
	}
	public void setZx_mainstructure(String zx_mainstructure) {
		this.zx_mainstructure = zx_mainstructure;
	}
	public String getZx_usescope() {
		return zx_usescope;
	}
	public void setZx_usescope(String zx_usescope) {
		this.zx_usescope = zx_usescope;
	}
	public String getZx_rate() {
		return zx_rate;
	}
	public void setZx_rate(String zx_rate) {
		this.zx_rate = zx_rate;
	}
	public String getZx_measureunit() {
		return zx_measureunit;
	}
	public void setZx_measureunit(String zx_measureunit) {
		this.zx_measureunit = zx_measureunit;
	}
	public String getZx_dszt() {
		return zx_dszt;
	}
	public void setZx_dszt(String zx_dszt) {
		this.zx_dszt = zx_dszt;
	}
	public String getFilecount() {
		return filecount;
	}
	public void setFilecount(String filecount) {
		this.filecount = filecount;
	}
	public String getZx_bpt() {
		return zx_bpt;
	}
	public void setZx_bpt(String zx_bpt) {
		this.zx_bpt = zx_bpt;
	}
	public String getZx_ysbpt() {
		return zx_ysbpt;
	}
	public void setZx_ysbpt(String zx_ysbpt) {
		this.zx_ysbpt = zx_ysbpt;
	}
	public String getZx_tolsdate() {
		return zx_tolsdate;
	}
	public void setZx_tolsdate(String zx_tolsdate) {
		this.zx_tolsdate = zx_tolsdate;
	}
	public String getZx_arrival_time() {
		return zx_arrival_time;
	}
	public void setZx_arrival_time(String zx_arrival_time) {
		this.zx_arrival_time = zx_arrival_time;
	}
	public String getZx_sms_cf() {
		return zx_sms_cf;
	}
	public void setZx_sms_cf(String zx_sms_cf) {
		this.zx_sms_cf = zx_sms_cf;
	}
	public String getZx_sms_xz() {
		return zx_sms_xz;
	}
	public void setZx_sms_xz(String zx_sms_xz) {
		this.zx_sms_xz = zx_sms_xz;
	}
	public String getZx_sms_syz() {
		return zx_sms_syz;
	}
	public void setZx_sms_syz(String zx_sms_syz) {
		this.zx_sms_syz = zx_sms_syz;
	}
	public String getZx_sms_blfy() {
		return zx_sms_blfy;
	}
	public void setZx_sms_blfy(String zx_sms_blfy) {
		this.zx_sms_blfy = zx_sms_blfy;
	}
	public String getZx_sms_jj() {
		return zx_sms_jj;
	}
	public void setZx_sms_jj(String zx_sms_jj) {
		this.zx_sms_jj = zx_sms_jj;
	}
	public String getZx_sms_jg() {
		return zx_sms_jg;
	}
	public void setZx_sms_jg(String zx_sms_jg) {
		this.zx_sms_jg = zx_sms_jg;
	}
	public String getZx_sms_zysx() {
		return zx_sms_zysx;
	}
	public void setZx_sms_zysx(String zx_sms_zysx) {
		this.zx_sms_zysx = zx_sms_zysx;
	}
	public String getZx_sms_fnyy() {
		return zx_sms_fnyy;
	}
	public void setZx_sms_fnyy(String zx_sms_fnyy) {
		this.zx_sms_fnyy = zx_sms_fnyy;
	}
	public String getZx_sms_etyy() {
		return zx_sms_etyy;
	}
	public void setZx_sms_etyy(String zx_sms_etyy) {
		this.zx_sms_etyy = zx_sms_etyy;
	}
	public String getZx_sms_lnyy() {
		return zx_sms_lnyy;
	}
	public void setZx_sms_lnyy(String zx_sms_lnyy) {
		this.zx_sms_lnyy = zx_sms_lnyy;
	}
	public String getZx_sms_ywzy() {
		return zx_sms_ywzy;
	}
	public void setZx_sms_ywzy(String zx_sms_ywzy) {
		this.zx_sms_ywzy = zx_sms_ywzy;
	}
	public String getZx_sms_ywgl() {
		return zx_sms_ywgl;
	}
	public void setZx_sms_ywgl(String zx_sms_ywgl) {
		this.zx_sms_ywgl = zx_sms_ywgl;
	}
	public String getZx_sms_ywdl() {
		return zx_sms_ywdl;
	}
	public void setZx_sms_ywdl(String zx_sms_ywdl) {
		this.zx_sms_ywdl = zx_sms_ywdl;
	}
	public String getZx_sms_yddl() {
		return zx_sms_yddl;
	}
	public void setZx_sms_yddl(String zx_sms_yddl) {
		this.zx_sms_yddl = zx_sms_yddl;
	}
	public String getZx_validperiod() {
		return zx_validperiod;
	}
	public void setZx_validperiod(String zx_validperiod) {
		this.zx_validperiod = zx_validperiod;
	}
	public String getZx_periodunit() {
		return zx_periodunit;
	}
	public void setZx_periodunit(String zx_periodunit) {
		this.zx_periodunit = zx_periodunit;
	}
	public String getZx_channel() {
		return zx_channel;
	}
	public void setZx_channel(String zx_channel) {
		this.zx_channel = zx_channel;
	}
	public String getZx_properties() {
		return zx_properties;
	}
	public void setZx_properties(String zx_properties) {
		this.zx_properties = zx_properties;
	}
	public String getZx_busiscopename1() {
		return zx_busiscopename1;
	}
	public void setZx_busiscopename1(String zx_busiscopename1) {
		this.zx_busiscopename1 = zx_busiscopename1;
	}
	public String getZx_busiscopename2() {
		return zx_busiscopename2;
	}
	public void setZx_busiscopename2(String zx_busiscopename2) {
		this.zx_busiscopename2 = zx_busiscopename2;
	}
	public String getZx_busiscopename3() {
		return zx_busiscopename3;
	}
	public void setZx_busiscopename3(String zx_busiscopename3) {
		this.zx_busiscopename3 = zx_busiscopename3;
	}
	public String getZx_busiscopename4() {
		return zx_busiscopename4;
	}
	public void setZx_busiscopename4(String zx_busiscopename4) {
		this.zx_busiscopename4 = zx_busiscopename4;
	}
	
	@Override
	public String toString() {
		return "PubGoods [goodsid=" + goodsid + ", opcode=" + opcode + ", goodspinyin=" + goodspinyin + ", goodsname="
				+ goodsname + ", currencyname=" + currencyname + ", goodsengname=" + goodsengname + ", goodsinvname="
				+ goodsinvname + ", goodsshortname=" + goodsshortname + ", goodsformalname=" + goodsformalname
				+ ", goodsformalpy=" + goodsformalpy + ", goodsno=" + goodsno + ", standardno=" + standardno
				+ ", barcode=" + barcode + ", goodstype=" + goodstype + ", goodsunit=" + goodsunit
				+ ", firstapprovedocno=" + firstapprovedocno + ", approvedocno=" + approvedocno + ", registdocno="
				+ registdocno + ", standardtype=" + standardtype + ", factoryid=" + factoryid + ", validperiod="
				+ validperiod + ", respperiod=" + respperiod + ", periodunit=" + periodunit + ", trademark=" + trademark
				+ ", prodarea=" + prodarea + ", supplytaxrate=" + supplytaxrate + ", salestaxrate=" + salestaxrate
				+ ", fixpricetype=" + fixpricetype + ", accflag=" + accflag + ", defaultagtflag=" + defaultagtflag
				+ ", storagecondition=" + storagecondition + ", transcondition=" + transcondition + ", combinflag="
				+ combinflag + ", customstax=" + customstax + ", minreqgoodsqty=" + minreqgoodsqty + ", financeno="
				+ financeno + ", otcflag=" + otcflag + ", securityflag=" + securityflag + ", chineseflag=" + chineseflag
				+ ", medicinetype=" + medicinetype + ", importflag=" + importflag + ", medicineflag=" + medicineflag
				+ ", credate=" + credate + ", inputmanid=" + inputmanid + ", memo=" + memo + ", usestatus=" + usestatus
				+ ", nmrmsclassid=" + nmrmsclassid + ", price=" + price + ", busiscope=" + busiscope + ", boxflag="
				+ boxflag + ", integernx=" + integernx + ", function=" + function + ", againchkflag=" + againchkflag
				+ ", medicinesort=" + medicinesort + ", limitedsaleflag=" + limitedsaleflag + ", leastsaleqty="
				+ leastsaleqty + ", entryset=" + entryset + ", financeno2=" + financeno2 + ", gspflag=" + gspflag
				+ ", ecodeflag=" + ecodeflag + ", zhl=" + zhl + ", goodsgroupcode=" + goodsgroupcode + ", mpgid="
				+ mpgid + ", drugtaboo=" + drugtaboo + ", goodsproperties=" + goodsproperties + ", gspcategoryid="
				+ gspcategoryid + ", qlogid=" + qlogid + ", pkid=" + pkid + ", direction=" + direction + ", tranflag="
				+ tranflag + ", trandate=" + trandate + ", exportdate=" + exportdate + ", importdate=" + importdate
				+ ", sys_modifydate=" + sys_modifydate + ", initflag=" + initflag + ", newgoodsid=" + newgoodsid
				+ ", varietyid=" + varietyid + ", alonepackflag=" + alonepackflag + ", medicinetypename="
				+ medicinetypename + ", busiscopename=" + busiscopename + ", keysphyconservedays=" + keysphyconservedays
				+ ", specialdrug=" + specialdrug + ", coldflag=" + coldflag + ", temperaturedown=" + temperaturedown
				+ ", temperatureup=" + temperatureup + ", specialctrl=" + specialctrl + ", transporttime="
				+ transporttime + ", treatment=" + treatment + ", dosage=" + dosage + ", permitno=" + permitno
				+ ", towmsdate=" + towmsdate + ", usetype=" + usetype + ", packname=" + packname + ", packsize="
				+ packsize + ", ks=" + ks + ", jylb=" + jylb + ", employeename=" + employeename + ", employeeid="
				+ employeeid + ", diagnosticinfo=" + diagnosticinfo + ", usegoodstime=" + usegoodstime
				+ ", zx_goodstype=" + zx_goodstype + ", zx_ypbm=" + zx_ypbm + ", zx_mainuseway=" + zx_mainuseway
				+ ", zx_mainstructure=" + zx_mainstructure + ", zx_usescope=" + zx_usescope + ", zx_rate=" + zx_rate
				+ ", zx_measureunit=" + zx_measureunit + ", zx_dszt=" + zx_dszt + ", filecount=" + filecount
				+ ", zx_bpt=" + zx_bpt + ", zx_ysbpt=" + zx_ysbpt + ", zx_tolsdate=" + zx_tolsdate
				+ ", zx_arrival_time=" + zx_arrival_time + ", zx_sms_cf=" + zx_sms_cf + ", zx_sms_xz=" + zx_sms_xz
				+ ", zx_sms_syz=" + zx_sms_syz + ", zx_sms_blfy=" + zx_sms_blfy + ", zx_sms_jj=" + zx_sms_jj
				+ ", zx_sms_jg=" + zx_sms_jg + ", zx_sms_zysx=" + zx_sms_zysx + ", zx_sms_fnyy=" + zx_sms_fnyy
				+ ", zx_sms_etyy=" + zx_sms_etyy + ", zx_sms_lnyy=" + zx_sms_lnyy + ", zx_sms_ywzy=" + zx_sms_ywzy
				+ ", zx_sms_ywgl=" + zx_sms_ywgl + ", zx_sms_ywdl=" + zx_sms_ywdl + ", zx_sms_yddl=" + zx_sms_yddl
				+ ", zx_validperiod=" + zx_validperiod + ", zx_periodunit=" + zx_periodunit + ", zx_channel="
				+ zx_channel + ", zx_properties=" + zx_properties + ", zx_busiscopename1=" + zx_busiscopename1
				+ ", zx_busiscopename2=" + zx_busiscopename2 + ", zx_busiscopename3=" + zx_busiscopename3
				+ ", zx_busiscopename4=" + zx_busiscopename4 + "]";
	}
	
}

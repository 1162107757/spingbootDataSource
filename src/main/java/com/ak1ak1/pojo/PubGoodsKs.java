package com.ak1ak1.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="pub_goods_ks")
public class PubGoodsKs {

	@Id
	private Integer ksid;
	private String ksname;
	
	
	public Integer getKsid() {
		return ksid;
	}
	public void setKsid(Integer ksid) {
		this.ksid = ksid;
	}
	public String getKsname() {
		return ksname;
	}
	public void setKsname(String ksname) {
		this.ksname = ksname;
	}
	
}

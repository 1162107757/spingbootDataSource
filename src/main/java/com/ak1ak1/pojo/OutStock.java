package com.ak1ak1.pojo;

import javax.persistence.Table;

@Table(name="zk_outstock_his")
public class OutStock {

	private String outstockno;
	private String customid;
	private String customname;
	private String salername;
	private String agentname;
	private String outstocktype;
	private String payextra;
	private String billamount;
	private String ispay;
	private String payment;
	private String paybank;
	private String payaccount;
	private String paytime;
	private String invtypename;
	private String invcode;
	private String invno;
	private String billtime;
	private String expresscompany;
	private String expressno;
	private String delivertime;
	private String consignee;
	private String contact;
	private String address;
	private String orderresource;
	private String actiontime;
	private String resulttype;
	private String resulttime;
	private String resultremark;
	private String dtlnums;
	private String prepareflag;
	private String platform_code;
	private String shopcode;
	private String shopname;
	private String isreturn;
	private String actiontype;
	private String amount;
	
	
	public String getOutstockno() {
		return outstockno;
	}
	public void setOutstockno(String outstockno) {
		this.outstockno = outstockno;
	}
	public String getCustomid() {
		return customid;
	}
	public void setCustomid(String customid) {
		this.customid = customid;
	}
	public String getCustomname() {
		return customname;
	}
	public void setCustomname(String customname) {
		this.customname = customname;
	}
	public String getSalername() {
		return salername;
	}
	public void setSalername(String salername) {
		this.salername = salername;
	}
	public String getAgentname() {
		return agentname;
	}
	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}
	public String getOutstocktype() {
		return outstocktype;
	}
	public void setOutstocktype(String outstocktype) {
		this.outstocktype = outstocktype;
	}
	public String getPayextra() {
		return payextra;
	}
	public void setPayextra(String payextra) {
		this.payextra = payextra;
	}
	public String getBillamount() {
		return billamount;
	}
	public void setBillamount(String billamount) {
		this.billamount = billamount;
	}
	public String getIspay() {
		return ispay;
	}
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getPaybank() {
		return paybank;
	}
	public void setPaybank(String paybank) {
		this.paybank = paybank;
	}
	public String getPayaccount() {
		return payaccount;
	}
	public void setPayaccount(String payaccount) {
		this.payaccount = payaccount;
	}
	public String getPaytime() {
		return paytime;
	}
	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}
	public String getInvtypename() {
		return invtypename;
	}
	public void setInvtypename(String invtypename) {
		this.invtypename = invtypename;
	}
	public String getInvcode() {
		return invcode;
	}
	public void setInvcode(String invcode) {
		this.invcode = invcode;
	}
	public String getInvno() {
		return invno;
	}
	public void setInvno(String invno) {
		this.invno = invno;
	}
	public String getBilltime() {
		return billtime;
	}
	public void setBilltime(String billtime) {
		this.billtime = billtime;
	}
	public String getExpresscompany() {
		return expresscompany;
	}
	public void setExpresscompany(String expresscompany) {
		this.expresscompany = expresscompany;
	}
	public String getExpressno() {
		return expressno;
	}
	public void setExpressno(String expressno) {
		this.expressno = expressno;
	}
	public String getDelivertime() {
		return delivertime;
	}
	public void setDelivertime(String delivertime) {
		this.delivertime = delivertime;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrderresource() {
		return orderresource;
	}
	public void setOrderresource(String orderresource) {
		this.orderresource = orderresource;
	}
	public String getActiontime() {
		return actiontime;
	}
	public void setActiontime(String actiontime) {
		this.actiontime = actiontime;
	}
	public String getResulttype() {
		return resulttype;
	}
	public void setResulttype(String resulttype) {
		this.resulttype = resulttype;
	}
	public String getResulttime() {
		return resulttime;
	}
	public void setResulttime(String resulttime) {
		this.resulttime = resulttime;
	}
	public String getResultremark() {
		return resultremark;
	}
	public void setResultremark(String resultremark) {
		this.resultremark = resultremark;
	}
	public String getDtlnums() {
		return dtlnums;
	}
	public void setDtlnums(String dtlnums) {
		this.dtlnums = dtlnums;
	}
	public String getPrepareflag() {
		return prepareflag;
	}
	public void setPrepareflag(String prepareflag) {
		this.prepareflag = prepareflag;
	}
	public String getPlatform_code() {
		return platform_code;
	}
	public void setPlatform_code(String platform_code) {
		this.platform_code = platform_code;
	}
	public String getShopcode() {
		return shopcode;
	}
	public void setShopcode(String shopcode) {
		this.shopcode = shopcode;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getIsreturn() {
		return isreturn;
	}
	public void setIsreturn(String isreturn) {
		this.isreturn = isreturn;
	}
	public String getActiontype() {
		return actiontype;
	}
	public void setActiontype(String actiontype) {
		this.actiontype = actiontype;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OutStock [outstockno=" + outstockno + ", customid=" + customid + ", customname=" + customname
				+ ", salername=" + salername + ", agentname=" + agentname + ", outstocktype=" + outstocktype
				+ ", payextra=" + payextra + ", billamount=" + billamount + ", ispay=" + ispay + ", payment=" + payment
				+ ", paybank=" + paybank + ", payaccount=" + payaccount + ", paytime=" + paytime + ", invtypename="
				+ invtypename + ", invcode=" + invcode + ", invno=" + invno + ", billtime=" + billtime
				+ ", expresscompany=" + expresscompany + ", expressno=" + expressno + ", delivertime=" + delivertime
				+ ", consignee=" + consignee + ", contact=" + contact + ", address=" + address + ", orderresource="
				+ orderresource + ", actiontime=" + actiontime + ", resulttype=" + resulttype + ", resulttime="
				+ resulttime + ", resultremark=" + resultremark + ", dtlnums=" + dtlnums + ", prepareflag="
				+ prepareflag + ", platform_code=" + platform_code + ", shopcode=" + shopcode + ", shopname=" + shopname
				+ ", isreturn=" + isreturn + ", actiontype=" + actiontype + ", amount=" + amount + "]";
	}
	
}


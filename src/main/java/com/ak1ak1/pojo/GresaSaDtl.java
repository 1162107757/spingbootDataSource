package com.ak1ak1.pojo;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "GRESA_SA_DTL")
public class GresaSaDtl {

	@Id
	private Integer rsadtlid;
	private String memo;
	private String patient;
	private Long goodsid;
	private String patientsex;
	private Long patientage;
	private String recipedoctor;
	private String recipehospital;
	private String zx_telephonenumber;
	
	public String getZx_telephonenumber() {
		return zx_telephonenumber;
	}
	public void setZx_telephonenumber(String zx_telephonenumber) {
		this.zx_telephonenumber = zx_telephonenumber;
	}
	public Integer getRsadtlid() {
		return rsadtlid;
	}
	public void setRsadtlid(Integer rsadtlid) {
		this.rsadtlid = rsadtlid;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public Long getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(Long goodsid) {
		this.goodsid = goodsid;
	}
	public String getPatientsex() {
		return patientsex;
	}
	public void setPatientsex(String patientsex) {
		this.patientsex = patientsex;
	}
	public Long getPatientage() {
		return patientage;
	}
	public void setPatientage(Long patientage) {
		this.patientage = patientage;
	}
	public String getRecipedoctor() {
		return recipedoctor;
	}
	public void setRecipedoctor(String recipedoctor) {
		this.recipedoctor = recipedoctor;
	}
	public String getRecipehospital() {
		return recipehospital;
	}
	public void setRecipehospital(String recipehospital) {
		this.recipehospital = recipehospital;
	}
	
}

package com.ak1ak1.pojo;

import javax.persistence.Table;

@Table(name = "recipe_allot")
public class RecipeAllot {
	
	private String name;
	private String hospital;
	private String ks;
	private String illness;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getKs() {
		return ks;
	}
	public void setKs(String ks) {
		this.ks = ks;
	}
	public String getIllness() {
		return illness;
	}
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
}

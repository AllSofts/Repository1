package com.yang.Model;

import java.util.List;

public class Member {
	private int oldselfid;
	
	
	
	public int getOldselfid() {
		return oldselfid;
	}

	public void setOldselfid(int oldselfid) {
		this.oldselfid = oldselfid;
	}

	private int selfid;
	
	private int factionsid;
	
	private String selfname;
	
	private String introduction;
	
	private Factions factions;

	public int getSelfid() {
		return selfid;
	}

	public void setSelfid(int selfid) {
		this.selfid = selfid;
	}

	public int getFactionsid() {
		return factionsid;
	}

	public void setFactionsid(int factionsid) {
		this.factionsid = factionsid;
	}

	public String getSelfname() {
		return selfname;
	}

	public void setSelfname(String selfname) {
		this.selfname = selfname;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Factions getFactions() {
		return factions;
	}

	public void setFactions(Factions factions) {
		this.factions = factions;
	}
	

	
	
}

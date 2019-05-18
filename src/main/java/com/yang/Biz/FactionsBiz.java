package com.yang.Biz;

import java.util.List;

import com.yang.Model.Factions;

public interface FactionsBiz {
	public boolean InsertFactionsData(Factions factions);
	
	public List<Factions> SearchAllFactionsData();
	
	public int DeleteFactionsData(int id);
	
	public Factions SearchSingleFactionsData(int id);
	
	public int SaveSingleDFactionsData(Factions factions);
}

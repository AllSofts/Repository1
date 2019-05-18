package com.yang.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yang.Model.Factions;
@Mapper
public interface FactionsDao {
	public int InsertFactions(Factions factions);
	
	public List<Factions> SearchAllFactions();
	
	public int DeleteFactions(int id);
	
	public Factions SearchSingleFactions(int id);
	
	public int SaveSingleFactions(Factions factions);
	
}

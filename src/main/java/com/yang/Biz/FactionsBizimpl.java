package com.yang.Biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yang.Dao.FactionsDao;
import com.yang.Dao.MemberDao;
import com.yang.Model.Factions;
@Service
public class FactionsBizimpl implements FactionsBiz {
	@Resource
	private FactionsDao dao;
	
	@Override
	public boolean InsertFactionsData(Factions factions) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		int row = 0;
		
		row = dao.InsertFactions(factions);
		
		if(row>0) {
			flag=true;
		}
		return flag;
	}
	@Override
	public List<Factions> SearchAllFactionsData() {
		// TODO Auto-generated method stub
		
		List<Factions> list = null;
		
		list = dao.SearchAllFactions();
		
		return list;
	}
	@Override
	public int DeleteFactionsData(int id) {
		// TODO Auto-generated method stub
		int row = 0;
		 row = dao.DeleteFactions(id);
		return row;
	}
	@Override
	public Factions SearchSingleFactionsData(int id) {
		// TODO Auto-generated method stub
		return dao.SearchSingleFactions(id);
	}
	@Override
	public int SaveSingleDFactionsData(Factions factions) {
		// TODO Auto-generated method stub
		
		return dao.SaveSingleFactions(factions);
	}

}

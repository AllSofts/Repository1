package com.yang.Biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yang.Dao.MemberDao;
import com.yang.Model.Member;

@Service
public class MemberBizimpl implements MemberBiz {
	@Resource
	private MemberDao dao;
	

	@Transactional
	@Override
	public int DeleteAllMemberData(int id) {
		// TODO Auto-generated method stub
		int row = 0;
		
		row = dao.DeleteAllMember(id);
		
		return row;
	}


	@Override
	public int InsertMemberData(Member member) {
		// TODO Auto-generated method stub
		int row = 0;
		row = dao.InsertMember(member);
		return row;
	}


	@Override
	public List<Member> SearchAllMemberData() {
		// TODO Auto-generated method stub
		List<Member> list= dao.SearchAllMember();
		return list;
	}


	@Override
	public int DeleteMemberData(int selfid) {
		// TODO Auto-generated method stub
		
		
		return dao.DeleteMember(selfid);
	}


	@Override
	public Member SearchSingleMemberData(int selfid) {
		// TODO Auto-generated method stub
		
		
		return dao.SearchSingleMember(selfid);
	}


	@Override
	public int SaveMemberData(Member member) {
		// TODO Auto-generated method stub
		
		
		return  dao.SaveMember(member);
	}

}

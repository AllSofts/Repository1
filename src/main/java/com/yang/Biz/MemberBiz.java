package com.yang.Biz;

import java.util.List;

import com.yang.Model.Member;

public interface MemberBiz {
	
	public int DeleteAllMemberData(int id);
	
	public int InsertMemberData(Member member);
	
	public List<Member> SearchAllMemberData();
	
	public int DeleteMemberData(int selfid);
	
	public Member SearchSingleMemberData(int selfid);
	
	public int SaveMemberData(Member member);
}

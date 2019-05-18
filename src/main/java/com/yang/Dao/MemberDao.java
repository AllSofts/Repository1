package com.yang.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import com.yang.Model.Member;

@Mapper
public interface MemberDao {
	
	public int InsertMember(Member member);
	
	public int DeleteAllMember(int id);
	
	public List<Member> SearchAllMember();
	
	public int DeleteMember(int selfid);
	
	public Member SearchSingleMember(int selfid);
	
	public int SaveMember(Member member);
}

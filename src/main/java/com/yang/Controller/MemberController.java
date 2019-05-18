package com.yang.Controller;

/**
 * code is far away from bug with the animal protecting
 *  ┏┓　   ┏┓
 * ┏┛┻━━━┛┻	┓
 * ┃　　　　	 ┃
 * ┃　~　   ~  ┃
 * ┃　┳┛　┗┳	 ┃
 * ┃　　　　	 ┃
 * ┃　　　┻	 ┃
 * ┃　　　　	 ┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃
 * 　　┃　　　┃
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　┣┓
 * 　　┃　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫┃┫┫
 * 　　　┗┻┛┗┻┛
 *
 */

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yang.Biz.FactionsBiz;
import com.yang.Biz.MemberBiz;
import com.yang.Model.Factions;
import com.yang.Model.Member;
@Controller
public class MemberController {
	@Resource
	private FactionsBiz fbiz;
	@Resource
	private MemberBiz biz;
	



	@RequestMapping("/InitAddMember")
	public String InitAddMember(HttpServletRequest request) {
		List<Factions> list = fbiz.SearchAllFactionsData();
		request.setAttribute("list",list);
		
		return "addMember.jsp";
	}
	
	@RequestMapping("/AddMember")
	public String AddMember(HttpServletRequest request,Member member,@RequestParam(value="selfid") int selfid,@RequestParam(value="factionsid") int factionsid) {
		
		String selfname = request.getParameter("selfname");
		
		String introduction = request.getParameter("introduction");
		
		
		member = new Member();
		
		member.setSelfid(selfid);
		
		member.setFactionsid(factionsid);
		
		member.setSelfname(selfname);
		
		member.setIntroduction(introduction);
		
		int row = 0;
		
		 row = biz.InsertMemberData(member);
		 
		 if(row>0) {
			 return "redirect:/findAllMember";
		 }else {
	    	
	    	 return "redirect:/error.html";
	    	
	    }	 
	}
	@RequestMapping("/findAllMember")
	 public String findAllMember(HttpServletRequest request) {
		
		List<Member> list = biz.SearchAllMemberData();
		
		request.setAttribute("list",list);
		
		 return "ShowMember.jsp";
	 }
	@RequestMapping("/deleteMember")
	public String deleteMember(@RequestParam(value="selfid") int selfid){
		
		
		   int row=biz.DeleteMemberData(selfid);
		 if(row>0) {
			 return "redirect:/findAllMember";
		 }else {
	    	
	    	 return "redirect:/error.html";
	    	
	    }	
	}
	@RequestMapping("/updateMember")
	public String updateMember(HttpServletRequest request,@RequestParam(value="selfid") int selfid) {
		List<Factions> list = fbiz.SearchAllFactionsData();
		
		Member member = biz.SearchSingleMemberData(selfid);
		
		request.setAttribute("list", list);
		
		request.setAttribute("member", member);
		return "saveMember.jsp";
	}
	@RequestMapping("/SaveMember")
	public String SaveMember(HttpServletRequest request,Member member,@RequestParam(value="factionsid") int factionsid,@RequestParam(value="oldselfid") int oldselfid,@RequestParam(value="selfid") int selfid) {
		String selfname = request.getParameter("selfname");
		
		String introduction = request.getParameter("introduction");
		
		member = new Member();
		
		member.setSelfid(selfid);
		
		member.setFactionsid(factionsid);
		
		member.setIntroduction(introduction);
		
		member.setSelfname(selfname);
		
		member.setOldselfid(oldselfid);
		
		int row = biz.SaveMemberData(member);
		 if(row>0) {
			 return "redirect:/findAllMember";
		 }else {
	    	
	    	 return "redirect:/error.html";
	    	
	    }
	}
	
	
}

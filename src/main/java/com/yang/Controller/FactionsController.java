package com.yang.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yang.Biz.FactionsBiz;
import com.yang.Biz.MemberBiz;
import com.yang.Model.Factions;
import com.yang.Model.Member;
@Controller
public class FactionsController {
	@Resource
	private FactionsBiz biz;
	@Resource
	private MemberBiz mbiz;
	
	@RequestMapping("/AddFactions")
	public String AddFactions(Factions factions,HttpServletRequest request) {
		
		String id = request.getParameter("id");
		
		
		boolean flag = biz.InsertFactionsData(factions);
		
		System.out.println(flag);
	    if(flag) {
	    	
	    	return "redirect:/findAllFactions";
	    	
	    }
	    
	    else {
	    	
	    	 return "redirect:/error.html";
	    	
	    }
		
	}
	@RequestMapping("/findAllFactions")
	public String findAllFactions(HttpServletRequest request) {
		
		List<Factions> list = null;
		
		list = biz.SearchAllFactionsData();
		
		request.setAttribute("list",list);
		
		return "ShowFactions.jsp";
	}
	@RequestMapping("/deleteFactions")
	public String deleteFactions(@RequestParam(value="id") int id) {
		int row = 0;
		int row0 = mbiz.DeleteAllMemberData(id);
		row = biz.DeleteFactionsData(id);
		
	    if(row>0) {
	    	
	    	return "redirect:/findAllFactions";
	    	
	    }
	    
	    else {
	    	
	    	 return "redirect:/error.html";
	    	
	    }
	}
	@RequestMapping("/updateFactions")
	public String updateFactions(HttpServletRequest request,@RequestParam(value="id") int id) {
		Factions factions = biz.SearchSingleFactionsData(id);
		
		request.setAttribute("factions", factions);
		return "saveFactions.jsp";
	}
	
	@RequestMapping("/saveFactions")
	public String saveFactions(HttpServletRequest request,@RequestParam(value="id") int id,@RequestParam(value="oldid") int oldid,Factions factions) {
		
		String factionsname = request.getParameter("factionsname");
		
		String factionsdescribe = request.getParameter("factionsdescribe");
		
		String number = request.getParameter("number");
		
		
		 factions =  new Factions();
		 
		 factions.setId(id);
		 
		 factions.setFactionsname(factionsname);
		 
		 factions.setFactionsdescribe(factionsdescribe);
		 
		 factions.setNumber(Integer.parseInt(number));
		 
		 factions.setOldid(oldid);
		 
		int row = biz.SaveSingleDFactionsData(factions);
		if(row>0) {
	    	
	    	return "redirect:/findAllFactions";
	    	
	    }
	    
	    else {
	    	
	    	 return "redirect:/error.html";
	    	
	    }
	}



	
	
}

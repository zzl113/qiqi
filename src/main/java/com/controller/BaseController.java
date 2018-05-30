package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.SmStartupintentionService;
@Controller
@RequestMapping("/")
public class BaseController {
	@Autowired
	private SmStartupintentionService smStartupintentionService;
      //拦截source
	@RequestMapping("/index")
	public ModelAndView index(String source){
		ModelAndView mad=new ModelAndView();
	
		Integer sourceNum= smStartupintentionService.seleSource(source);
		if(sourceNum<=0){
			source="37";
			mad.addObject("source",source);
			mad.setViewName("/smStartupintention.jsp");
		}else if(sourceNum>=1){
			mad.addObject("source",source);
			mad.setViewName("/smStartupintention.jsp");
		}
		return mad;
	}
	
}

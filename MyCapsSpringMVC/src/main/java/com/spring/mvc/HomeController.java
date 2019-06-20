package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET,value = "/page")
	public String getPage()
	{
		return "Homepage";
	}

	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String getText()
	{
		return "login";
	}
	@RequestMapping(value = "/msg",method = RequestMethod.GET)
	@ResponseBody
	public String getMsg()
	{
		return "Study Hard Icompass is coming" ; 
	}
	@RequestMapping(value = "/obj",method = RequestMethod.GET)
	public String getObject(Model model)
	{
		model.addAttribute("name","Somnath");
		return "demo";
	}
	@RequestMapping(value = "/motive",method = RequestMethod.GET)
	public ModelAndView getAttribute()
	{
		ModelAndView modelandview = new ModelAndView("demo", "name", "Somnath");
		return modelandview;
	}
	@RequestMapping(value = "/demo",method = RequestMethod.GET)
	public ModelAndView getAtt()
	{
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("name","Wishky");
		modelandview.setViewName("demo");
		return modelandview;
	}
}


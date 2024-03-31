package com.webapplication.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
	
// public String show(HttpServletRequest req) {
//		HttpSession session=req.getSession();
//		String name=req.getParameter("name");
//		session.setAttribute("name", name);
//	 System.out.println("Hi"+" "+name);
//	 
//	 return "home.jsp";
// }
	//using viewandmodel example only one parameter
//	@RequestMapping("home")
//		public ModelAndView home(@RequestParam("name")String myName) {
//			
//			ModelAndView mv=new ModelAndView();
//			mv.addObject("name",myName);
//			mv.setViewName("home.jsp");
//			return mv;
//			
//		}
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home.jsp");
		return mv;
		
	}
	
	}


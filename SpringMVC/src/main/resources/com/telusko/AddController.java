package com.telusko;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AddController {

	@RequestMapping("/add")
	
	
	public ModelAndView add(HttpServeltRequest request,HttpServletResponse response) {
		int i=Integer.parseInt(request.getParameter("t1"));
		int j= Integer.parseInt(request.getParamenter("t2"));
		int k= i+j;
		 AddService as= new AddService();
		 int k=as.add(i,j);
		ModelAndView mv=new ModelAndView();
		mv.setView("display.jsp");
		mv.addObject("result:",k);
		return mv;
		
	}
}

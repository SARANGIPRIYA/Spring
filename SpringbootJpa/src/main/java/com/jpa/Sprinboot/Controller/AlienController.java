package com.jpa.Sprinboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
	@RequestMapping("/home")
 public String home() {
	 return "home.jsp";
 }

}

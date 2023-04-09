package com.ks.sb2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	
	public String prelogin() {
		
		return"login2";
	}
	
	@RequestMapping("/log")
	public String login(@RequestParam("Uname") String un ,@RequestParam("pass") String pass ){
		System.out.println("Username "+un);
		System.out.println("password "+pass);
		return"success";
		
	}
	
	@RequestMapping("/register")
	public String prereg(){
	     
		return"register";
		
		} 
	
	@RequestMapping("/reg")
	public String regdata(@ModelAttribute("stu") student s, Model m){
		
		System.out.println("name is "+s.getName());
		System.out.println("Username is "+s.getUsername());
		System.out.println("password is "+s.getPassword());
        System.out.println("Mobile number is"+s.getMobileno());
        System.out.println("Email is"+s.getEmail());
        System.out.println("Address is "+s.getAddress());
        m.addAttribute("data", s);
		
		
		return"success";
	}
}

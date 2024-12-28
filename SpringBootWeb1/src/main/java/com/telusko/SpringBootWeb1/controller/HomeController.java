package com.telusko.SpringBootWeb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.SpringBootWeb1.model.Alien;

@Controller
public class HomeController {

//	@RequestMapping("/")
//	public String home() {
//		return "index.jsp";
//	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

//	The Below code is using servlet how to pass client value to controller we see
//	@RequestMapping("add")
//	public String add(HttpServletRequest req, HttpSession session) {
//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
//		int result = (num1+num2);
//		System.out.println("Result is : "+result);
//		
//		session.setAttribute("result", result);
//		
//		return "result.jsp";
//	}

//	The below code if we simply pass the simple paramter then also it's working bez. the parameter which is coming from url 
//	is same if just change the parameter name it'll raise an exception saying illegalStateException
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, HttpSession session) {
////		int num1 = Integer.parseInt(req.getParameter("num1"));
////		int num2 = Integer.parseInt(req.getParameter("num2"));
//		int result = (a + b);
//		System.out.println("Result is : " + result);
//
//		session.setAttribute("result", result);
//		session.setAttribute("results", "Hello");
//
//		return "result.jsp";
//	}

//	The above code is working with session object but if, we do not want to work 
//	with session object then we use Model object below is the example
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model) {
////		int num1 = Integer.parseInt(req.getParameter("num1"));
////		int num2 = Integer.parseInt(req.getParameter("num2"));
//		int result = (a + b);
//		System.out.println("Result is : " + result);
//
//		model.addAttribute("result", result);
//		model.addAttribute("results", "Hello");
//
////		session.setAttribute("result", result);
////		session.setAttribute("results", "Hello");
//
//		return "result.jsp";
//	}
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model) {
////		int num1 = Integer.parseInt(req.getParameter("num1"));
////		int num2 = Integer.parseInt(req.getParameter("num2"));
//		int result = (a + b);
//		System.out.println("Result is : " + result);
//
//		model.addAttribute("result", result);
//		model.addAttribute("results", "Hello");
//
////		session.setAttribute("result", result);
////		session.setAttribute("results", "Hello");
//
//		return "result";
//	}

// The above is using Model object but below we're using ModelAndView object
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView model) {
//		int result = (a + b);
//		System.out.println("Result is : " + result);
//
//		model.addObject("result", result);
//		model.setViewName("result");
//
//
//		return model;
//	}

//	@RequestMapping("addAlien")
//	public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname,
//			ModelAndView model) {
//		Alien alien = new Alien();
//		alien.setAid(aid);
//		alien.setAname(aname);
//
//		model.addObject("alien", alien);
//		model.setViewName("result");
//
//		return model;
//	}
	
//	This is using ModelAttribute to overcome various @RequestParam annotation
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien alien) {
		return "result";
	}

}

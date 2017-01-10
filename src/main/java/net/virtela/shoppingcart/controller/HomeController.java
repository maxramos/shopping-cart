package net.virtela.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.virtela.shoppingcart.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/home")
	public String home(HttpSession session) {
		session.setAttribute("welcomeString", homeService.getWelcomeString());
		return "home";
	}

}

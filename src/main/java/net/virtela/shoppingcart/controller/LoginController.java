package net.virtela.shoppingcart.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {

	@RequestMapping("login")
	public String login() {
		return "login";
	}

	@RequestMapping("redirect")
	public String redirect() {
		for (GrantedAuthority authority : SecurityContextHolder.getContext().getAuthentication().getAuthorities()) {
			if ("ROLE_ADMIN".equals(authority.getAuthority())) {
				return "redirect:/admin/profile";
			} else if ("ROLE_USER".equals(authority.getAuthority())) {
				return "redirect:/user/profile";
			}
		}

		return null;
	}

}

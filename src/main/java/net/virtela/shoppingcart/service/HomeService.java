package net.virtela.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.virtela.shoppingcart.dao.HomeDao;

@Service
public class HomeService {

	@Autowired
	private HomeDao homeDao;

	public String getWelcomeString() {
		return homeDao.getWelcomeString();
	}

}

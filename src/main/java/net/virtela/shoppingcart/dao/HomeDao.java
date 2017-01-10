package net.virtela.shoppingcart.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HomeDao {

	public String getWelcomeString() {
		return "Hello World.";
	}

}

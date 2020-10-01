package com.app.main;

import com.app.dao.PlayerDAO;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
	
		PlayerDAO dao=new PlayerDAO();
		Player player=new Player(110, "Rudra", 24, "Kings", "m", "Chennai");
		int c= dao.createPlayer(player);
		if(c==1) {
			System.out.println("Player registerd with below details");
			System.out.println(player);
		}else {
			System.out.println("Failed registration");
		}
	}

}

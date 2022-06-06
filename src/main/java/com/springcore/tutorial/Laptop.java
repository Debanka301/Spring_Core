package com.springcore.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
	
	@Autowired
	private Games games;

//	public Games getGames() {
//		return games;
//	}
//
//	public void setGames(Games games) {
//		this.games = games;
//	}
	
	public void showGames() {
		System.out.println("Game name:- "+games.getGameName()+" Game id:- "+games.getGameId());
	}

}

package com.web.cricket.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.web.cricket.model.Player;


public interface TeamService {

	//Method data Plyaer data
	public Player getPlayerDatabyId(String id);
	
	// To get matches and score again by player id
	 public Object getMatchesOfPlayer(String id);
	 
	 //To generate response
	 public ResponseEntity<Object> generateResponse();
	
}

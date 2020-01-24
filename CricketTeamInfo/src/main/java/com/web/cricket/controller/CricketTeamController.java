package com.web.cricket.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.cricket.model.Player;
import com.web.cricket.service.TeamService;



@RestController
public class CricketTeamController {

	@Autowired
	public TeamService teamService;
	
	private static final Logger LOG = LogManager.getLogger(CricketTeamController.class);
	
	
	//Rest API call to get Player Information in which player id is input;
	@RequestMapping("/crickeTeam/playerInfo")
	@ResponseBody
	public Object getInfo(HttpServletRequest request,
	        @RequestParam(value = "playerId", required = true) String playerId,HttpServletResponse httpResponse,
	        HttpSession session)
	{
		
	LOG.info("In the Controller of Cricket Team");
	
	Object response= teamService.getMatchesOfPlayer(playerId);
	return  response;
	
	}
}

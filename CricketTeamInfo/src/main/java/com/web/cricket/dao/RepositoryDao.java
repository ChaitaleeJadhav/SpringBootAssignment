package com.web.cricket.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.cricket.model.Matches;
import com.web.cricket.model.Player;


@Repository
public class RepositoryDao {

	@Autowired
	public PlayerRepository repo; 
	
     public List<HashMap<Matches, Integer>> getPlayerInfo(String id)
	{
    
    	ArrayList<HashMap<Matches, Integer>> plyerInfo=new ArrayList<HashMap<Matches,Integer>>();
    			 
		List<Object[]> results=repo.getPlayerInfoById(id);

		List<HashMap<Matches, Integer>> mappMatch=new ArrayList<HashMap<Matches,Integer>>();
		if(results!=null)
		{
			
	     for(Object[] l:results)
	     {
		   HashMap<Matches, Integer> matchMapScore=new HashMap<Matches,Integer>();
		   matchMapScore.put((Matches)l[1],(Integer)l[2]);
		    mappMatch.add(matchMapScore);
	     }
	  
	}
	
		return mappMatch;
	}

     public Player getPlayerData(String id)
     {
		Player p= repo.getPlayerbyId(id);
		return p;    	 
     }
}

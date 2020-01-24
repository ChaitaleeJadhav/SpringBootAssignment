package com.web.cricket.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.web.cricket.dao.PlayerRepository;
import com.web.cricket.dao.RepositoryDao;
import com.web.cricket.model.Matches;
import com.web.cricket.model.Player;

@Service("teamService")
public class TeamServiceImp implements TeamService {

	@Autowired
	public RepositoryDao regDao; 
	


     public Object getMatchesOfPlayer(String id)
    {
    	 try
    	 {
    	List<HashMap<Matches, Integer>> payerObj=regDao.getPlayerInfo(id);
    	List<Matches> machesList=new ArrayList<Matches>();
    	 
    	Player p=getPlayerDatabyId(id);
    	if(p!=null) {
    	int totalScore=0;
    		 for ( HashMap<Matches, Integer> listScore :  payerObj)
    		 {

    			 for ( Matches keyMatch : listScore.keySet() )
    			 {
    			 totalScore=totalScore + listScore.get(keyMatch);
    			 keyMatch.setScorePerMatch(listScore.get(keyMatch));
    			 machesList.add(keyMatch);
    			 }
    
    			 
    				
    		 }
    		 
        	 p.setSumOfScores(totalScore);
        	 p.setMatches(machesList);
        	 return p;
    	} 
    	else
    	{
    		 Map<String,String> errorMap =new  HashMap<String,String>(); 
   		  
   		  errorMap.put("Status","Fail");
   		  errorMap.put("error","Player Id not found");
   		  return errorMap;

    	}
   }
    	 catch(Exception e)
    	 {
    		  Map<String,String> errorMap =new  HashMap<String,String>(); 
    		  
    		  errorMap.put("Status","Fail");
    		  errorMap.put("error",e.getMessage());
    		  return errorMap;
    	 }
	   	
    } 
     
     public Player getPlayerDatabyId(String id)
     {
		return regDao.getPlayerData(id);
	       	 
     }
      public ResponseEntity<Object> generateResponse()
      {
		return null;
    	  
      }
}

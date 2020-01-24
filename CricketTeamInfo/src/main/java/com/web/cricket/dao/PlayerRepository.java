package com.web.cricket.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.web.cricket.model.Mapping;
import com.web.cricket.model.Player;



public interface PlayerRepository extends JpaRepository<Mapping,String>{

	@Query(value="select map.ids.playerId,map.ids.matchId,map.score from Mapping map where map.ids.playerId.id=?1")
	List<Object[]> getPlayerInfoById(String id);
	
	@Query(value="select map.ids.playerId from Mapping map where map.ids.playerId.id=?1")
	Player getPlayerbyId(String id);
	
	
	
	
	
}

package com.web.cricket.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;




@Entity
public class Mapping  {

    @EmbeddedId
    public  PlayerMappingId ids;
    
    @Column(name ="score")
    private Integer score;

	public PlayerMappingId getIds() {
		return ids;
	}

	public void setIds(PlayerMappingId ids) {
		this.ids = ids;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}



}

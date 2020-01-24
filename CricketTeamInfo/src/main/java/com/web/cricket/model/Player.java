package com.web.cricket.model;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Player {

	@Id
	@Column(name ="id")
	private String id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="cricketTeam")
	private String cricket_team;
	
	@Transient
    private int sumOfScores;
	
	@Transient
    private List<Matches> matches;
	
	public Player() {
	
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCricket_team() {
		return cricket_team;
	}


	public void setCricket_team(String cricket_team) {
		this.cricket_team = cricket_team;
	}

	
	
	public int getSumOfScores() {
		return sumOfScores;
	}

	public void setSumOfScores(int sumOfScores) {
		this.sumOfScores = sumOfScores;
	}

	

	public List<Matches> getMatches() {
		return matches;
	}

	public void setMatches(List<Matches> matches) {
		this.matches = matches;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}

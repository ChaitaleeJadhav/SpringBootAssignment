package com.web.cricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Matches {

	@Id
	@Column(name ="id")
	private String id;
	@Column(name ="series_name")
   private String seriesName;
	@Column(name ="location")
   private String location;

	@Transient
    private int scorePerMatch;
	
   public Matches() {
}
   
   

public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getSeriesName() {
	return seriesName;
}
public void setSeriesName(String seriesName) {
	this.seriesName = seriesName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}



public int getScorePerMatch() {
	return scorePerMatch;
}



public void setScorePerMatch(int scorePerMatch) {
	this.scorePerMatch = scorePerMatch;
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
	Matches other = (Matches) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

	
	
}

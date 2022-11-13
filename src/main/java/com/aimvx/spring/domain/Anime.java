package com.aimvx.spring.domain;

public class Anime {
	private Long id;
	private String name;

	public void setId (Long id){
		this.id = id;
	}

	public Long getID(){
		return id;
	}

	public void setName (String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public Anime(){}

	public Anime(Long id, String name) {
		this.id = id;
		this.name = name;
	}

}

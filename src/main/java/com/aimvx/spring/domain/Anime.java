package com.aimvx.spring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Anime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	public void setId (Long id){
		this.id = id;
	}

	public Long getId(){
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

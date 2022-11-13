package com.aimvx.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aimvx.spring.domain.Anime;

@Service
public class AnimeService {
	public List<Anime> listAll() {
		return List.of(new Anime(1L, "DBZ"), new Anime(2L, "Berserk"), new Anime(3L, "Naruto"));
	}

}
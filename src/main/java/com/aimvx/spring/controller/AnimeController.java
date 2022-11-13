package com.aimvx.spring.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aimvx.spring.domain.Anime;
import com.aimvx.spring.util.DateUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("anime")
@Slf4j
@RequiredArgsConstructor
public class AnimeController {
	
	private final DateUtil dateUtil;
	
	@GetMapping(path = "list")
	public List<Anime> list(){
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return List.of(new Anime("DBZ"), new Anime("Berserk"), new Anime("Naruto"));
		
	}
}

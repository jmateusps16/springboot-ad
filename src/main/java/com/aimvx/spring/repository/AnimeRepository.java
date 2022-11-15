package com.aimvx.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aimvx.spring.domain.Anime;

public interface AnimeRepository extends  JpaRepository<Anime, Long>{
}
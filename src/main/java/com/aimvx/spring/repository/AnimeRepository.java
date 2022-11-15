package com.aimvx.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aimvx.spring.domain.Anime;

public interface AnimeRepository extends  JpaRepository<Anime, Long>{
    
    List<Anime> findByName(String name);
}
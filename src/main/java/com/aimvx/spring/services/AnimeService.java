package com.aimvx.spring.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aimvx.spring.domain.Anime;
import com.aimvx.spring.exception.BadRequestException;
import com.aimvx.spring.mapper.AnimeMapper;
import com.aimvx.spring.repository.AnimeRepository;
import com.aimvx.spring.requests.AnimePostRequestBody;
import com.aimvx.spring.requests.AnimePutRequestBody;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimeService {

	private final AnimeRepository animeRepository;

	public Page<Anime> listAll(Pageable pageable) {
		return animeRepository.findAll(pageable);
	}

	public List<Anime> listAllNonPageable() {
        return animeRepository.findAll();
    }

	public List<Anime> findByName(String name){
		return animeRepository.findByName(name);
	}

	public Anime findByIdOrThrowBadRequestException(long id){
		return animeRepository.findById(id)
				.orElseThrow(() -> new BadRequestException("Anime not Found"));
	}

	@Transactional
    public Anime save(AnimePostRequestBody animePostRequestBody) {
		return animeRepository.save(AnimeMapper.INSTANCE.toAnime(animePostRequestBody));
    }

    public void delete(long id) {
		animeRepository.delete(findByIdOrThrowBadRequestException(id));

    }

    public void replace(AnimePutRequestBody animePutRequestBody) {
		Anime savedAnime = findByIdOrThrowBadRequestException(animePutRequestBody.getId());
		Anime anime = AnimeMapper.INSTANCE.toAnime(animePutRequestBody);
		anime.setId(savedAnime.getId());
		animeRepository.save(anime);
    }

}
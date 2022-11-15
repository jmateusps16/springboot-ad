package com.aimvx.spring.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.aimvx.spring.domain.Anime;
import com.aimvx.spring.requests.AnimePostRequestBody;
import com.aimvx.spring.requests.AnimePutRequestBody;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);
    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}

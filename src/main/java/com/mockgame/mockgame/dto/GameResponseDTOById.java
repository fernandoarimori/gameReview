package com.mockgame.mockgame.dto;

import com.mockgame.mockgame.model.Game;

public record GameResponseDTOById(
        Long id,
        String title,
        Double score,
        Integer year,
        String genre,
        String platforms,
        String imgUrl,
        String shortDescription,
        String longDescription
) {
    public GameResponseDTOById(Game game){
        this(
                game.getId(),
                game.getTitle(),
                game.getScore(),
                game.getYear(),
                game.getGenre(),
                game.getPlatforms(),
                game.getImgUrl(),
                game.getShortDescription(),
                game.getLongDescription()
        );
    }
}

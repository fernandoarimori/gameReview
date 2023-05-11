package com.mockgame.mockgame.dto;

import com.mockgame.mockgame.model.GameList;

public record GameListResponseDTO(
        Long id,
        String name
) {
    public GameListResponseDTO(GameList list){
        this(list.getId(), list.getName());
    }
}

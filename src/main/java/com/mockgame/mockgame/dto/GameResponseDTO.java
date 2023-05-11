package com.mockgame.mockgame.dto;

import com.mockgame.mockgame.model.Game;
import com.mockgame.mockgame.projections.GameResponseDTOProjection;
import lombok.Getter;

@Getter
public class GameResponseDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameResponseDTO() {
    }

    public GameResponseDTO(Game g) {
        this.id = g.getId();
        this.title = g.getTitle();
        this.year = g.getYear();
        this.imgUrl = g.getImgUrl();
        this.shortDescription = g.getShortDescription();
    }

    public GameResponseDTO(GameResponseDTOProjection g) {
        this.id = g.getId();
        this.title = g.getTitle();
        this.year = g.getYear();
        this.imgUrl = g.getImgUrl();
        this.shortDescription = g.getShortDescription();
    }
}

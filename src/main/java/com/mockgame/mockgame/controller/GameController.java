package com.mockgame.mockgame.controller;

import com.mockgame.mockgame.dto.GameResponseDTO;
import com.mockgame.mockgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameResponseDTO> findAll(){
        return gameService.findAll();
    }
}

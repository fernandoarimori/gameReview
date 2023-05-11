package com.mockgame.mockgame.controller;

import com.mockgame.mockgame.dto.GameResponseDTO;
import com.mockgame.mockgame.dto.GameResponseDTOById;
import com.mockgame.mockgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public GameResponseDTOById findById(@PathVariable Long id) {
        return gameService.findById(id);
    }


    @GetMapping
    @Transactional(readOnly = true)
    public List<GameResponseDTO> findAll() {
        return gameService.findAll();
    }
}

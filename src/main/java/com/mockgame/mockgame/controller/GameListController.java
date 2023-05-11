package com.mockgame.mockgame.controller;

import com.mockgame.mockgame.dto.GameListResponseDTO;
import com.mockgame.mockgame.dto.GameResponseDTO;
import com.mockgame.mockgame.service.GameListService;
import com.mockgame.mockgame.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    @Transactional(readOnly = true)
    public List<GameListResponseDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping("/{id}/games")
    public List<GameResponseDTO> findByList(@PathVariable Long id){
        return gameService.findAllByList(id);
    }

}

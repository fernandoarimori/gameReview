package com.mockgame.mockgame.service;

import com.mockgame.mockgame.dto.GameResponseDTO;
import com.mockgame.mockgame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameResponseDTO> findAll(){
        var listaGames = gameRepository.findAll();
        var dto = listaGames.stream().map(GameResponseDTO::new).toList();
        return dto;
    }
}

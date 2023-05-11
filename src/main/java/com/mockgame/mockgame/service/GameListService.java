package com.mockgame.mockgame.service;

import com.mockgame.mockgame.dto.GameListResponseDTO;
import com.mockgame.mockgame.dto.GameResponseDTO;
import com.mockgame.mockgame.dto.GameResponseDTOById;
import com.mockgame.mockgame.repository.GameListRepository;
import com.mockgame.mockgame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListResponseDTO> findAll(){
        var listaGames = gameListRepository.findAll();
        var dto = listaGames.stream().map(GameListResponseDTO::new).toList();
        return dto;
    }
}

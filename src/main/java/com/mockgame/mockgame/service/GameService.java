package com.mockgame.mockgame.service;

import com.mockgame.mockgame.dto.GameResponseDTO;
import com.mockgame.mockgame.dto.GameResponseDTOById;
import com.mockgame.mockgame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameResponseDTOById findById(Long id){
        var getId = gameRepository.findById(id).get();
        return new GameResponseDTOById(getId);
    }
    @Transactional(readOnly = true)
    public List<GameResponseDTO> findAll(){
        var listaGames = gameRepository.findAll();
        var dto = listaGames.stream().map(GameResponseDTO::new).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameResponseDTO> findAllByList(Long idList){
        var listaGames = gameRepository.searchByList(idList);
        var dto = listaGames.stream().map(GameResponseDTO::new).toList();
        return dto;
    }

}

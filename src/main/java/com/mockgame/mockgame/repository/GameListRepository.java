package com.mockgame.mockgame.repository;

import com.mockgame.mockgame.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}

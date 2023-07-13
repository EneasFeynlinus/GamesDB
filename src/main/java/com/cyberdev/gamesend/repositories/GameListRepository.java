package com.cyberdev.gamesend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyberdev.gamesend.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
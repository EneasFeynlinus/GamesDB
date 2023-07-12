package com.cyberdev.gamesend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyberdev.gamesend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
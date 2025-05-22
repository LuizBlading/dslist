package com.blading.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blading.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

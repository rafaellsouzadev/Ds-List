package com.rafael.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

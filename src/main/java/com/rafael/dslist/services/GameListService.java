package com.rafael.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafael.dslist.dto.GameListDTO;
import com.rafael.dslist.entities.GameList;
import com.rafael.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> gamesList = gameListRepository.findAll();
		List<GameListDTO> gameListDto = gamesList.stream().map(x -> new GameListDTO(x)).collect(Collectors.toList());
		return gameListDto;
	}
}

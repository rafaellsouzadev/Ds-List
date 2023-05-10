package com.rafael.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafael.dslist.dto.GameDTO;
import com.rafael.dslist.dto.GameMinDTO;
import com.rafael.dslist.entities.Game;
import com.rafael.dslist.projections.GameMinProjection;
import com.rafael.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO find(Long id) {
		Game game = gameRepository.findById(id).get();
		return new GameDTO(game);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> games = gameRepository.findAll();
		List<GameMinDTO> gameDto = games.stream().map(obj -> new GameMinDTO(obj)).collect(Collectors.toList());
		return gameDto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		List<GameMinDTO> gameDto = games.stream().map(obj -> new GameMinDTO(obj)).collect(Collectors.toList());
		return gameDto;
	}
}

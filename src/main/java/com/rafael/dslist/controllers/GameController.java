package com.rafael.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.dslist.dto.GameDTO;
import com.rafael.dslist.dto.GameMinDTO;
import com.rafael.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<GameDTO> find(@PathVariable Long id) {
		GameDTO result = gameService.find(id);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll() {
		List<GameMinDTO> games = gameService.findAll();
		return ResponseEntity.ok().body(games);
	}

}

package com.gustavob.gamelist.controllers;

import com.gustavob.gamelist.dto.GameDTO;
import com.gustavob.gamelist.dto.GameListDTO;
import com.gustavob.gamelist.dto.GameMinDTO;
import com.gustavob.gamelist.services.GameListService;
import com.gustavob.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}

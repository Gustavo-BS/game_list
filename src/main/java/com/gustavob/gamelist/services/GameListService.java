package com.gustavob.gamelist.services;

import com.gustavob.gamelist.dto.GameDTO;
import com.gustavob.gamelist.dto.GameListDTO;
import com.gustavob.gamelist.dto.GameMinDTO;
import com.gustavob.gamelist.entities.Game;
import com.gustavob.gamelist.entities.GameList;
import com.gustavob.gamelist.repositories.GameListRepository;
import com.gustavob.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}

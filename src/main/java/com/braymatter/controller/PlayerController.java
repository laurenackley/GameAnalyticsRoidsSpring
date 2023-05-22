package com.braymatter.controller;

import com.braymatter.entities.Player;
import com.braymatter.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="http://localhost:8092")
@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    PlayerRepository playerRepo;

    @GetMapping("/players")
    public ResponseEntity<List<Player>> getAllPlayers(@RequestParam(required = false) String name){
        try{
            List<Player> players = new ArrayList<Player>();

            if(name == null){
                playerRepo.findAll().forEach(players::add);
            }else{
                playerRepo.findByNameContaining(name).forEach(players::add);
            }
            if(name.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(players, HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

package com.codeclan.example.controllers;

import com.codeclan.example.models.Pirate;
import com.codeclan.example.models.Raid;
import com.codeclan.example.repositories.PirateRepository;
import com.codeclan.example.repositories.RaidsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping(value = "/raids")
    public class RaidController {

        @Autowired
        RaidsRepository raidsRepository;

        @GetMapping()
        public List<Raid> getAllRaids(){
            return raidsRepository.findAll();
        }

//        @GetMapping("/{id}")
//        public Optional<Raid> getRaid(@PathVariable Long id){
//            return raidsRepository.findById(id);
//        }
    }

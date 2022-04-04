package de.mp.storeman.controller;

import de.mp.storeman.entity.bauteile;
import de.mp.storeman.repository.BauteileRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bauteile")

public class BauteileController {

    private BauteileRepository BauteileRepository;

    public BauteileController(de.mp.storeman.repository.BauteileRepository BauteileRepository) {
        this.BauteileRepository = BauteileRepository;
    }

    @GetMapping("")
    public List<bauteile> index() {
        return BauteileRepository.findAll();

}
           



    }
    


package com.remedial.tractorstore.controller;

import com.remedial.tractorstore.repositories.CatalogoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.Path;

@Controller

public class CatalogoController {

    private CatalogoRepository repository;

    public CatalogoController(CatalogoRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/catalogos")
    public String getCatalogos(Model model) {
        model.addAttribute("catalogos", repository.findAll());
        return "catalogos";
    }
}

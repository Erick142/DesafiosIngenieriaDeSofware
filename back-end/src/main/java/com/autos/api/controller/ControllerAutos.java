package com.autos.api.controller;

import com.autos.Service.ServiceAutos;
import com.autos.api.model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.autos.api.repository.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerAutos {

    @Autowired
    private RepoAutos repoAutos;
    private ServiceAutos serviceAutos;

    @GetMapping("/listadoautos")
    public List<Auto> todos(){
        return (List<Auto>) repoAutos.findAll();
    }

    @RequestMapping("/auto/{id}")
    public Optional<Auto> porID(@PathVariable Integer id){
        return repoAutos.findById(id);
    }

    @RequestMapping("/generar/{cantidad}")
    public Optional<Auto> porID(@PathVariable int cantidad){

        return null ;
    }






}
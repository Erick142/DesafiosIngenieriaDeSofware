package com.demo.controller;

import com.demo.Service.ServiceAutos;
import com.demo.model.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {
    @Autowired
    private ServiceAutos serviceAutos;
    @RequestMapping("/generar/{cantidad}")
    @ResponseBody
    private List<Auto> hola(@PathVariable("cantidad")int cantidad){
        List<Auto> autos=new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            autos.add(serviceAutos.generarAuto());
        }
        return autos;
    }
}

package com.autos.api.model;


import java.util.ArrayList;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.Entity;


@Data
@NoArgsConstructor

@Entity(name = "Autos")
public class Auto{
    @Id
    private Integer id;
    private String marca;
    private String anio;
    private String color;
    private int precio;
    private String tipo;
    private String motor;
    private boolean turbo;
    private boolean Sunroof;
    private int popularidad;
    private int cabinas;

}
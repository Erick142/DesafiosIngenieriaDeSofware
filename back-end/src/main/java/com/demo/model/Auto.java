package com.demo.model;


public class Auto{
    private static int idEstatica=0;
    private int id;
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

    public Auto(){
        idEstatica++;
        this.id=idEstatica;
    }

    public static int getIdEstatica() {
        return idEstatica;
    }

    public static void setIdEstatica(int idEstatica) {
        Auto.idEstatica = idEstatica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public boolean isSunroof() {
        return Sunroof;
    }

    public void setSunroof(boolean sunroof) {
        Sunroof = sunroof;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public int getCabinas() {
        return cabinas;
    }

    public void setCabinas(int cabinas) {
        this.cabinas = cabinas;
    }
}
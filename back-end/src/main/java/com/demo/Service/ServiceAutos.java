package com.demo.Service;

import com.demo.model.Auto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ServiceAutos{

    private List<Auto> listaAutos;

    ServiceAutos(){
        listaAutos = new ArrayList<>();

    }

    public Auto getAuto(Integer id){
        return listaAutos.get(id);
    }

    public String elegirTipo(){
        String tipos[] = new String[]{"Sedan","Camioneta","SUV"};
        return tipos[(int)(Math.random() * tipos.length)];
    }

    public String elegirMotor(String tipo){
        String motor="";
        int numero=(int)(Math.random() * 3);

        String motorSedan[] = new String[]{"1.4cc","1.6cc","2.0cc"};
        String motorCamioneta[] = new String[]{"2.4cc","3.0cc","4.0cc"};
        String motorSUV[] = new String[]{"1.8cc","2.2cc","2.8cc"};

        if (tipo.equals("Sedan")){
            motor = motorSedan[numero];
        } else if (tipo.equals("Camioneta")) {
            motor = motorCamioneta[numero];
        } else if (tipo.equals("SUV")) {
            motor = motorSUV[numero];
        }

        return motor;
    }

    public String elegirMarca() {
        String marca="";

        String marcas[] = new String[]{"Toyota","Volkswagen","Chevrolet","Ford","Nissan"};
        marca= marcas[(int)(Math.random() * marcas.length)];
        return marca;
    }

    public String elegirColor(){
        String colores[] = new String[]{"Blanco","Rojo","Azul","Negro","Gris"};
        return colores[(int)(Math.random() * colores.length)];
    }

    public int elegirCabinas(){
        return (int)(Math.random() * 2)+1;
    }

    public int elegirPrecio(){
        return (int)(Math.random() * (30000000-8000000)) + 8000000;
    }

    public int elegirPopularidad(){
        return (int)(Math.random() * 100) + 1;
    }

    public String elegirAnio(){
        return String.valueOf((int)(Math.random() * 8) + 2015);
    }


    public Auto generarAuto() {

        Random rd = new Random();
        Auto auto = new Auto();

        auto.setTipo(elegirTipo());
        auto.setMotor(elegirMotor(auto.getTipo()));
        auto.setMarca(elegirMarca());
        auto.setColor(elegirColor());
        auto.setPrecio(elegirPrecio());
        auto.setTurbo(rd.nextBoolean());
        auto.setAnio(elegirAnio());
        auto.setPopularidad(elegirPopularidad());

        if (auto.getTipo()=="Camioneta"){
            auto.setCabinas(elegirCabinas());
        } else if (auto.getTipo()=="SUV") {
            auto.setSunroof(rd.nextBoolean());
        }

    return auto;
    }



    /*
ID: ID único al generar
Marca: Al menos 5
Año: desde 2015 hasta 2023
Color: al menos 5
Precio: desde $8.000.000 hasta $30.000.000
Turbo: Si o No
Tipo: Sedan, camioneta, SUV
Motor:
Para Sedan: 1.4cc, 1.6cc, 2.0cc
Para camioneta: 2.4cc, 3.0cc, 4.0cc
Para SUV: 1.8cc, 2.2cc, 2.8cc
Cabinas: 1 o 2 (SOLO CAMIONETAS)
Sunroof: Si o No (SOLO SUV)
Popularidad: 0


    String motorSedan[] = new String[3];
    motorSedan[0]="1.4cc";
    motorSedan[1]="1.6cc";
    motorSedan[2]="2.0cc";

    String tipos[]= new String[3];
    tipos[0]="Sedan";
    tipos[1]="Camioneta";
    tipos[2]="SUV";


    String motorCamioneta[] = new String[3];
    motorCamioneta[0]="2.4cc";
    motorCamioneta[1]="3.0cc";
    motorCamioneta[2]="4.0cc";

    String motorSUV[] = new String[3];
    motorSUV[0]="1.8cc";
    motorSUV[1]="2.2cc";
    motorSUV[2]="2.8cc";

    String marcas[] = new String[5];
    marcas[0]="Toyota";
    marcas[1]="Volkswagen";
    marcas[2]="Chevrolet";
    marcas[3]="Ford";
    marcas[4]="Nissan";

    String colores[] = new String[5];
    colores[0]="Blanco";
    colores[1]="Rojo";
    colores[2]="Azul";
    colores[3]="Negro";
    colores[4]="Gris";
 */

}
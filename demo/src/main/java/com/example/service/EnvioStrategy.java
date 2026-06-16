package com.example.service;

public interface EnvioStrategy {
    //metodo para calcular costo
    //declaro el metodo que se implementara en las clases concretas, recibe peso y kilometros para 
    //calcular el costo del envio
    double calcularCosto(double peso, int kilometros);

}

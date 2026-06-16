package com.example.service;
//clase que implementa la estrategia de envío estándar, el costo se calcula con un costo base y un costo adicional por peso
public class Estandar implements EnvioStrategy {

    @Override
    public double calcularCosto(double peso, int kilometros) {
        // Costo base para envío estándar
        double costoBase = 1000.0;
        // Costo adicional por peso (por kg)
        double costoPeso = 5.0 * peso;
        //

        return costoBase + costoPeso;
    }

}

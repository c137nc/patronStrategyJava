package com.example.service;

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

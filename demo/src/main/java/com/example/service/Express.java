package com.example.service;

public class Express implements EnvioStrategy {

    @Override
    public double calcularCosto(double peso, int kilometros) {
        // Costo base para envío express
        double costoBase = 1500.0;
        // Costo adicional por distancia (por km)
        double costoDistancia = 80.0 * kilometros;

        return costoBase + costoDistancia;
    }

}

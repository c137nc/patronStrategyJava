package com.example.service;
//clase que implementa la estrategia de enví  o express, el costo se calcula con un costo base y un costo adicional por distancia
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

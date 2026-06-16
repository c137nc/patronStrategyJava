package com.example.service;

public class RetiroLocal implements EnvioStrategy {

    @Override
    public double calcularCosto(double peso, int kilometros) {
        // El costo es fijo para retiro en tienda
        return 0.0;
    }

}

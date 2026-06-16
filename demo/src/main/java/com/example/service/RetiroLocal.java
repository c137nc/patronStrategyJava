package com.example.service;
//clase que implementa la estrategia de retiro local, el costo es fijo (0)
public class RetiroLocal implements EnvioStrategy {

    @Override
    public double calcularCosto(double peso, int kilometros) {
        // El costo es fijo para retiro en tienda
        return 0.0;
    }

}

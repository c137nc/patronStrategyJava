package com.example.domain;

import com.example.service.EnvioStrategy;

public class Pedido {
    //declaro la interfaz que voy a usar 
    private EnvioStrategy envioStrategy; //sera una estrategia
    //defino atributos
    private String descripcion;
    private double peso;
    private int kilometros;
    public Pedido(EnvioStrategy envioStrategy, String descripcion, double peso, int kilometros) {
        //validaciones
        if (envioStrategy == null) {
            throw new IllegalArgumentException("La estrategia de envío no puede ser nula.");
        }
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede ser nula o vacía.");
        }
        if (peso < 0) {
                throw new IllegalArgumentException("El peso no puede ser negativo.");
        }
        if (kilometros < 0) {
            throw new IllegalArgumentException("Los kilómetros no pueden ser negativos.");
        }


        this.envioStrategy = envioStrategy;
        this.descripcion = descripcion;
        this.peso = peso;
        this.kilometros = kilometros;
    }

    //metodo para calcular costo
    public double calcularCosto() {
        return envioStrategy.calcularCosto(peso, kilometros);
    }
    
    
    //getters y setters

    @Override
    public String toString() {
        
        return this.getDescripcion() + " - Costo: " + this.calcularCosto();
    }

    public EnvioStrategy getEnvioStrategy() {
        return envioStrategy;
    }

    public void setEnvioStrategy(EnvioStrategy envioStrategy) {
        this.envioStrategy = envioStrategy;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    
    

}

package com.example;

public class EnvioMalHechoParaVerError {
    //defino atributos
    private String descripcion;
    private TipoEnvio tipoEnvio;
    private double peso;
    private int kilometros;
    //constructor
    public EnvioMalHechoParaVerError(String descripcion, TipoEnvio tipoEnvio, double peso, int kilometros) {

        //agrego exceociones 
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede ser nula o vacía.");
        }
        if (peso < 0) {
                throw new IllegalArgumentException("El peso no puede ser negativo.");
        }
        if (kilometros < 0) {
            throw new IllegalArgumentException("Los kilómetros no pueden ser negativos.");
        }


        this.descripcion = descripcion;
        this.tipoEnvio = tipoEnvio;
        this.peso = peso;
        this.kilometros = kilometros;
    }

    public EnvioMalHechoParaVerError() {
    }

    //metodo para calcular costo
    public double calcularCosto() {
        switch (this.tipoEnvio) {
            case ESTANDAR:
                return 1000 + (5 * this.peso);
            case EXPRESS:
                return 1500 + (80 * this.kilometros);
            case RETIRO_EN_TIENDA:
                return 0;
            default:
                throw new IllegalArgumentException("Tipo de envío no válido.");
        }
    }
    //getters y setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
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

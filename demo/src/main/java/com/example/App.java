package com.example;

import com.example.domain.Pedido;
import com.example.service.Estandar;
import com.example.service.Express;

/**
La empresa “Envíos Ya” cuenta con un sistema desarrollado en Java que permite calcular el costo de distintos tipos de envío. Actualmente, el sistema contempla tres modalidades: ESTANDAR, EXPRESS y RETIRO_EN_TIENDA.

Estas opciones se encuentran representadas mediante un enum, y la lógica de cálculo del costo está concentrada dentro de la clase Envío, en un método que utiliza un switch según el tipo de envío.

-        Envío Estándar: cuesta $1000 fijo + $5 cada 1 kilogramo.

-        Envío Express: cuesta $1500 fijo + $80 por kilómetro.

-        Envío Retiro en sucursal: cuesta $0.

Además, el programa principal crea distintos objetos Envío y muestra por pantalla el costo correspondiente en cada caso
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //creo pedido
        Pedido pedido1 = new Pedido(new Estandar(), "Pedido 1", 10.0, 50);
        Pedido pedido2 = new Pedido(new Express(), "Pedido 2", 5.0, 100);

        //muestro
        System.out.println(pedido1.toString());
        System.out.println(pedido2.toString());

        //cambio estrategia
        pedido1.setEnvioStrategy(new Express());
        System.out.println("Después de cambiar la estrategia de envío:");
        System.out.println(pedido1.toString());
    }
}

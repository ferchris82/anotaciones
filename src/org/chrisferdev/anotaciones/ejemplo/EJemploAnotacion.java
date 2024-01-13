package org.chrisferdev.anotaciones.ejemplo;

import org.chrisferdev.anotaciones.ejemplo.models.Producto;
import org.chrisferdev.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;

public class EJemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro roble");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}

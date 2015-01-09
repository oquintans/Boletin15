/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author Oscar
 */
public class Seleccion {

    private String nombre;
    private String apellidos;
    private int id;
    private int edad;

    public Seleccion() {

    }

    public Seleccion(String n, String a, int id, int e) {

        nombre = n;
        apellidos = a;
        this.id = id;
        edad = e;
    }

    public void concentrarse() {
        System.out.println("concentrase a seleccion");
    }

    public void viajar() {
        System.out.println("viaxa a seleccion");
    }

    @Override
    public String toString() {
        return "Seleccion{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad + '}';

    }

}

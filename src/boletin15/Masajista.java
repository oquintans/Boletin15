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
public class Masajista extends Seleccion {
    private String titulacion;
    private int añosExp;

    public Masajista(String titulacion, int añosExp) {
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }

    public Masajista(String titulacion, int añosExp, String n, String a, int id, int e) {
        super(n, a, id, e);
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }
    
}

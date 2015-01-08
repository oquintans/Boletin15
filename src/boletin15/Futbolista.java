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
public class Futbolista extends Seleccion {

    private int dorsal;
    private int demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(String n, String a, int id, int e, int dor, int dem) {
        super(n, a, id, e);
        dorsal = dor;
        demarcacion = dem;
    }
}

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
public class Entrenador extends Seleccion {

    private String ideFederacion;

    public Entrenador(String ideFederacion) {
        this.ideFederacion = ideFederacion;
    }

    public Entrenador(String n, String a, int id, int e, String ideFederacion) {
        super(n, a, id, e);
        this.ideFederacion = ideFederacion;
    }
    
    public void dirigirPartido(){
        
    }
    public void dirigirEntrenamiento(){
        
    }

}

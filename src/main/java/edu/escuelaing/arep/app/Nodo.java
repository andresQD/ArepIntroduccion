/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app;

/**
 *
 * @author Andrés Quintero
 */
public class Nodo {
    //datos
    float i;
    //Referencia al nodo siguiente
    Nodo siguiente;
    
    public Nodo(float i){
        this.i = i;
        this.siguiente = null;
    }
    
    public void mostrarData(){
        System.out.print(" " + i);
        
    }
}

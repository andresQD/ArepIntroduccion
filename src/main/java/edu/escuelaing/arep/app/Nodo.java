/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app;

/**
 * La clase Nodo permite referenciar los elementos dentro de la lissta encadenada
 * @author Andrés Quintero
 */
public class Nodo {
    //datos
    private float i;
    //Referencia al nodo siguiente
    private Nodo siguiente;
    
    /**
     * Constructor de la clase Nodo
     * @param valor
     */
    public Nodo(float valor){
        i = valor;
    }
    
    /**
     * Este método permite traer datos dentro de la lista encadenada
     * 
     */
    public float getI() {
        return i;
    }
    
    /**
     * Este método permite asignar datos dentro de la lista encadenada
     * @param i
     */
    public void setI(float i) {
        this.i = i;
    }
    
    /**
     * Este método permite traer el nodo siguiente de otro nodo dentro de la lista encadenada
     * 
     */
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    /**
     * Este método permite asignar el nodo siguiente de otro nodo dentro de la lista encadenada
     * @param n
     */
    public void setSiguiente(Nodo n) {
        siguiente = n;
        
    }

    
}

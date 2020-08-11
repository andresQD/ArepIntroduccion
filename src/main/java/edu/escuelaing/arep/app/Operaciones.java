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
public class Operaciones {
    
    private LinkedList lista;
    private float promedio;
    private int numDatos;
    private float resta;
    private float desviacion;
    
    
    public Operaciones(LinkedList lista){
        this.lista = lista;
        this.promedio = promedio;
        this.resta = resta;
        this.desviacion = desviacion;
    }
    
    private float promedio(){
        float res = 0;
        int nums = 0;
        float prom = 0;
        if(!lista.isEmpty()){
            Nodo actual = lista.getCabeza();
            while(!(actual == null)){
                res += actual.getI();
                nums++;
                actual = actual.getSiguiente();
            }
            prom = res / nums;
        }
        numDatos = nums;
        return prom;
    }
    
    private float resta(){
        float res = 0;
        if(!lista.isEmpty()){
            Nodo actual = lista.getCabeza();
            while(!(actual == null)){
                res += (float) Math.pow(actual.getI() - getPromedio(),2);
                actual = actual.getSiguiente();
            }
        }
        return res;
    }
    
    private float desviacion(){
        return (float) Math.sqrt(getResta()/(getNumDatos()-1));
    }

    public LinkedList getLista() {
        return lista;
    }

    public float getPromedio() {
        return promedio;
    }

    public int getNumDatos() {
        return numDatos;
    }

    public float getResta() {
        return resta;
    }

    public float getDesviacion() {
        return desviacion;
    }
    
    
}

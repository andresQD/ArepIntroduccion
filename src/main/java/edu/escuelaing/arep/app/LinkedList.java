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
public class LinkedList {
    
    private Nodo cabeza;
    private Nodo cola;
    private int tamaño = 0;
    
    public LinkedList(){
        cabeza = null;
        cola = null;
    }
    
    public boolean isEmpty(){
        return cabeza == null;
    }
    
    public void insertarInicio(float i){
        Nodo Nn = new Nodo(i);
        if (isEmpty()){
            cola = Nn;
        }else{
            Nn.siguiente = cabeza;
        }
        cabeza = Nn;
        tamaño++;
    }
    
    public void insertarFin(float i){
        Nodo Nn = new Nodo(i);
        if (isEmpty()){
            cabeza = Nn;
        }else{
            cola.siguiente = Nn;
        }
        cola = Nn;
        tamaño++;
    }
    
    //Validar indice
    private boolean isValidIndex(int indice){
        return indice >= 0 && indice <= tamaño;
    }
    
    public void insertarConIndice(float i, int indice){
        if(!isValidIndex(indice)){
            throw new IndexOutOfBoundsException("Index " + indice +" not valid for linked list of size " + tamaño);
        }
        Nodo Nn = new Nodo(i);
        Nodo actual = cabeza;
        Nodo temp = cabeza;
        //si el indice es 0:
        if (indice == 0) {
            insertarInicio(i);
        } //si el indice es igual al tamaño
        else if (indice == tamaño) {
            insertarFin(i);
        } else {
            for (int j = 0; j < indice && actual.siguiente != null; j++) {
                temp = actual;
                actual = actual.siguiente;
            }
            Nn.siguiente = actual;
            temp.siguiente = Nn;
            tamaño++;
            }   
    }
    
    public Nodo getNodo(int indice){
        if(!isValidIndex(indice)){
            throw new IndexOutOfBoundsException("Index " + indice +" not valid for linked list of size " + tamaño);
        }
        Nodo actual = cabeza;
        for(int j = 0; j < indice;j++){
            actual = actual.siguiente;            
        }
        return actual;
    }
    
    //recorrer y mostrar todos los nodos
    public void mostarLista(){
        Nodo actual = cabeza;
        while(actual != null){
            actual.mostrarData();
            actual = actual.siguiente;
        }
        System.out.println("");
    }
    
    //remover el primer nodo
    public void eliminarPrimero(){
        if(cabeza == null){
            throw new RuntimeException("List is empty..");
        }
        //si solo hay un nodo
        if(cabeza.siguiente == null){
            cola = null;
        }
        cabeza = cabeza.siguiente;
        tamaño--;
    }
    
    //remover el ultimo nodo
    public void eliminarUltimo(){
        if(cola == null){
            throw new RuntimeException("List is empty..");
        }
        Nodo actual = cabeza;
        Nodo temp = cabeza;
        //si solo hay un nodo
        if(cabeza.siguiente == null){
            cabeza = null;
        }
        while(actual != cola){
            temp = actual;
            actual = actual.siguiente;
        }
        cola = temp;
        cola.siguiente = null;
        tamaño--;
    }
    
        //remover nodo por indeice 
    public void eliminarPorIndice(int indice){
        if(!isValidIndex(indice +1)){
            throw new IndexOutOfBoundsException("Index " + indice +" not valid for linked list of size " + tamaño);
        }
        Nodo actual = cabeza;
        Nodo temp = cabeza;
        if(indice == 0){
            eliminarPrimero();
        }
        else if(indice == tamaño - 1){
            eliminarUltimo();
        }
        else{
            for(int j = 0; j < indice && actual.siguiente != null; j++){
                temp = actual;
                actual = actual.siguiente;
            }
            temp.siguiente = actual.siguiente;
            actual.siguiente = null;
            tamaño--;
        }
    }
    
}

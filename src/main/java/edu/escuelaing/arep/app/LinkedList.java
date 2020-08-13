/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.app;

/**
 * La clase LinkedList se encarga de almacenar los datos que ingresen por medio
 * del archivo de texto, cuenta con operaciones basicas, como insertar y
 * eliminar
 *
 * @author Andrés Quintero
 */
public class LinkedList {
    
    //Cabeza de la lista
    private Nodo cabeza;
    //Tmaño de la lista
    private int tamaño;

    public LinkedList() {
        cabeza = null;
        tamaño = 0;
    }

    /**
     * Este método permite insertar un valor al inicio de la lista encadenada
     * @param valor
     */
    public void insertarInicio(float valor) {
        if (cabeza != null) {
            Nodo temp = cabeza;
            cabeza = new Nodo(valor);
            cabeza.setSiguiente(temp);
        } else {
            cabeza = new Nodo(valor);
        }
        tamaño++;
    }
    
    /**
     * Este método permite insertar un valor al final de la lista encadenada
     * @param valor
     */
    public void insertarFin(float valor) {
        if (cabeza != null) {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(new Nodo(valor));
        } else {
            cabeza = new Nodo(valor);
        }
        tamaño++;
    }
    
    /**
     * Este método permite traer el tamaño de la lista encadenada
     * 
     */
    public int getTamaño() {
        return tamaño;
    }
    
    /**
     * Este método permite eliminar el primer elemento de la lista encadenada
     * 
     */
    public Nodo eliminarPrimero() {
        Nodo temp = cabeza;
        cabeza = cabeza.getSiguiente();
        tamaño--;
        return temp;
    }

    
    
    
   
    //Implementacion antigua
    /**
     * private boolean isValidIndex(int indice){ return indice >= 0 && indice <
     * = tamaño; }
     *
     * public void insertarConIndice(float i, int indice){
     * if(!isValidIndex(indice)){ throw new IndexOutOfBoundsException("Index " +
     * indice +" not valid for linked list of size " + tamaño); } Nodo Nn = new
     * Nodo(i); Nodo actual = cabeza; Nodo temp = cabeza; //si el indice es 0:
     * if (indice == 0) { insertarInicio(i); } //si el indice es igual al tamaño
     * else if (indice == tamaño) { insertarFin(i); } else { for (int j = 0; j <
     * indice && actual.siguiente != null; j++) { temp = actual; actual =
     * actual.siguiente; } Nn.siguiente = actual; temp.siguiente = Nn; tamaño++;
     * } }
     *
     * public Nodo getNodo(int indice){ if(!isValidIndex(indice)){ throw new
     * IndexOutOfBoundsException("Index " + indice +" not valid for linked list
     * of size " + tamaño); } Nodo actual = cabeza; for(int j = 0; j <
     * indice;j++){ actual = actual.siguiente; } return actual; }
     *
     * //recorrer y mostrar todos los nodos public void mostarLista(){ Nodo
     * actual = cabeza; while(actual != null){ actual.mostrarData(); actual =
     * actual.siguiente; } System.out.println("");
    }*
     */
    //remover el primer nodo      
    /**
     * remover el ultimo nodo public void eliminarUltimo(){ if(cola == null){
     * throw new RuntimeException("List is empty.."); } Nodo actual = cabeza;
     * Nodo temp = cabeza; //si solo hay un nodo if(cabeza.siguiente == null){
     * cabeza = null; } while(actual != cola){ temp = actual; actual =
     * actual.siguiente; } cola = temp; cola.siguiente = null; tamaño--; }
     *
     * //remover nodo por indeice public void eliminarPorIndice(int indice){
     * if(!isValidIndex(indice +1)){ throw new IndexOutOfBoundsException("Index
     * " + indice +" not valid for linked list of size " + tamaño); } Nodo
     * actual = cabeza; Nodo temp = cabeza; if(indice == 0){ eliminarPrimero();
     * } else if(indice == tamaño - 1){ eliminarUltimo(); } else{ for(int j = 0;
     * j < indice && actual.siguiente != null; j++){ temp = actual; actual =
     * actual.siguiente; } temp.siguiente = actual.siguiente; actual.siguiente =
     * null; tamaño--; } }
     *
     * public Nodo getCabeza() { return cabeza; }
     *
     * public void setCabeza(Nodo cabeza) { this.cabeza = cabeza; }
     *
     * public Nodo getCola() { return cola; }
     *
     * public void setCola(Nodo cola) { this.cola = cola;
    }*
     */
    //public void setTamaño(int tamaño) {
    //  this.tamaño = tamaño;
    //}
}

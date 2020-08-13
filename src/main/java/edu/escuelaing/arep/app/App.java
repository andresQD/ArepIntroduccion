package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * La clase App se encarga de procesar el archivo y realizar las operaciones pertinentes
 *
 */
public class App {
    
    
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        //Probando funcionamiento de la LinkedList
       /** System.out.println( "Hello World!" );
        LinkedList list = new LinkedList();
        list.insertarInicio(1);
        list.insertarFin(2);
        list.insertarFin(3);
        list.insertarFin((float) 4.4);
        list.insertarFin(5);
        System.out.println("After insertions--");
        list.mostarLista();
        list.eliminarUltimo();
        System.out.println("After removal--");
        list.mostarLista();
        list.eliminarPorIndice(1);
        System.out.println("After removal--");
        list.mostarLista();
        System.out.println("Get Node--");
        Nodo node = list.getNodo(1);
        node.mostrarData();**/
        
    
        LinkedList a = new LinkedList();
	LinkedList b = new LinkedList();
       
    	BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\file.txt"));
        String str = null;
        while((str = br.readLine()) != null) {
        	float val = Float.parseFloat(str);
			a.insertarInicio(val);
			b.insertarFin(val);
		}
		float media = promedio(a);
		float desviacion = desviacion(b,media);
		System.out.println("La media es " + media + " la desviacion es " + desviacion);
    }
    
    /**
     * Realizar el promedio de un conjunto de datos dentro de la linked list
     * @param lista
     */
    public static float promedio(LinkedList lista){
        float sum = 0;
        float tam = lista.getTamaño();
        for(int j = 0; j < tam; j++){
            sum += lista.eliminarPrimero().getI();
            //System.out.println("La media es " + sum );
        }
        float prom = sum / tam;
        return prom;  
    }
    
    /**
     * Realizar el promedio de un conjunto de datos dentro de la linked list
     * @param lista
     * @param prom
     */
    public static float desviacion(LinkedList lista,float prom){
		int sum = 0;
		int tam = lista.getTamaño();
		for(int j = 0; j < tam; j++){
			float valor = lista.eliminarPrimero().getI();
			sum += Math.pow((valor - prom), 2);
		}
		float desv = (float) Math.pow((sum / (float)(tam - 1)), 0.5);
		return desv;
	}
}

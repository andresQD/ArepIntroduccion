package edu.escuelaing.arep.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
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
        node.mostrarData();
    }
}

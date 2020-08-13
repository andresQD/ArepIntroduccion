package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 *
 * @author Andres Quintero
 *
 * @version (a version 15/8/19)
 */
public class AppTest {

    /**
     * Default constructor for test class AppTest
     */
    public AppTest() {
    }

    @Test
    public void pruebaJUnit() {

        assertTrue(true);
    }

    @Test
    public void promedioDeberiaSerCorrecto() throws IOException {
        LinkedList lista = new LinkedList();
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\file.txt"));
        String str = null;
        while ((str = br.readLine()) != null) {
            float valor = Float.parseFloat(str);
            lista.insertarInicio((float) valor);;
        }
        double promedio = App.promedio(lista);
        assertEquals(String.format("%.2f", promedio), "638,90");
        br.close();
    }

    @Test
    public void desviacionDeberiaSerCorrecta() throws IOException {
        LinkedList lista = new LinkedList();
        LinkedList lista1 = new LinkedList();
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\file.txt"));
        String str = null;
        while ((str = br.readLine()) != null) {
            float valor = Float.parseFloat(str);
            lista.insertarInicio(valor);
            lista1.insertarInicio(valor);
        }
        float promedio = App.promedio(lista);
        float desviacion = App.desviacion(lista1, promedio);
        //System.out.println(desviacion);
        assertEquals(String.format("%.2f", desviacion), "625,63");
        br.close();
    }
}

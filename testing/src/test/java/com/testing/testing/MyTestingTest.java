package com.testing.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MyTestingTests {

    @Test
    public void testSumar() {
        int num1 = 35;
        int num2 = 79;

        int result = MyTesting.sumar(num1, num2);

        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckNegative() {
        int num = -99;
        boolean negativo;

        try {
            negativo = MyTesting.checkPositivo(num);
        } catch (IllegalArgumentException e) {
            negativo = false;
        }
        assertFalse(negativo);
    }

    @Test
    public void testCheckPositive() {
        int num = 99;

        boolean resultado = MyTesting.checkPositivo(num);

        assertTrue(resultado);
    }

    @Test
    public void testContarLetrasA() {
        MyTesting myTesting = new MyTesting();
        String cadena = "Palabra";
        int resultado = 3;

        int letrasA = myTesting.contarLetrasA(cadena);

        assertTrue(resultado == letrasA);
    }

    @Test
    public void testContieneElemento() {

        MyTesting myTesting = new MyTesting();
        List<String> lista = new ArrayList<>(Arrays.asList("nariz", "cuenco", "agua", "sol", "primavera"));
        String elemento = "sol";
        boolean resultado = myTesting.contieneElemento(lista, elemento);
        assertTrue(resultado);
    }

    @Test
    public void testRevertirCadena() {
        MyTesting myTesting = new MyTesting();
        String cadena = "travis es mi perro";
        String reverseCadena = "orrep im se sivart";
        String resultado = myTesting.revertirCadena(cadena);

        assertTrue(resultado.equals(reverseCadena));
    }

    @Test
    public void testFactorial() {
        MyTesting myTesting = new MyTesting();
        int numero = 3;
        long resultadoFactorial = 6;
        long resultado = myTesting.factorial(numero);

        assertTrue(resultado == resultadoFactorial);
    }

    @Test
    public void testFactorialMenorCero() {
        MyTesting myTesting = new MyTesting();
        int numero = -8;
        long resultadoFactorial = 0;
        long resultado;
        try {
            resultado = myTesting.factorial(numero);
        } catch (IllegalArgumentException e) {
            resultado = 0;
        }
        assertTrue(resultado == resultadoFactorial);
    }

    @Test
    public void testEsPrimo() {
        MyTesting myTesting = new MyTesting();
        int numero = 2;
        boolean resultado = myTesting.esPrimo(numero);

        assertTrue(resultado);
    }

    @Test
    public void testEsPrimoMenorUno() {
        MyTesting myTesting = new MyTesting();
        int numero = 0;
        boolean resultado = myTesting.esPrimo(numero);

        assertFalse(resultado);
    }

    @Test
    public void testEsPrimoNoPrimo() {
        MyTesting myTesting = new MyTesting();
        int numero = 8;
        boolean resultado = myTesting.esPrimo(numero);

        assertFalse(resultado);
    }
    @Test
    public void testEsPrimoNegativo() {
        MyTesting myTesting = new MyTesting();
        int numero = -5;
        boolean resultado = myTesting.esPrimo(numero);
    
        assertFalse(resultado);
    }
    
    @Test
    public void testEsPrimoMayorPrimo() {
        MyTesting myTesting = new MyTesting();
        int numero = 11;
        boolean resultado = myTesting.esPrimo(numero);
    
        assertTrue(resultado);
    }
    
    @Test
    public void testEsPrimoMayorNoPrimo() {
        MyTesting myTesting = new MyTesting();
        int numero = 12;
        boolean resultado = myTesting.esPrimo(numero);
    
        assertFalse(resultado);
    }
    
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        MyTesting myTesting = new MyTesting();
        String resultado = myTesting.mensajeConRetraso();
        assertEquals("Listo después de retraso", resultado);
    }

    @Test
    public void testConvertirAString() {
        MyTesting myTesting = new MyTesting();
        List<Integer> listaEnteros = new ArrayList<>(Arrays.asList(1, 21, 9, 99));
        List<String> listaString = new ArrayList<>(Arrays.asList("1", "21", "9", "99"));

        List<String> resultado = myTesting.convertirAString(listaEnteros);

        assertEquals(resultado, listaString);

    }

    @Test
    public void testCalcularMedia() {
        MyTesting myTesting = new MyTesting();
        List<Integer> lista = new ArrayList<>(Arrays.asList(20, 10, 90));
        int media = 40;

        double resultado = myTesting.calcularMedia(lista);

        assertEquals(resultado, media);
    }

    @Test
    public void testCalcularMediaVacia() {
        MyTesting myTesting = new MyTesting();
        List<Integer> lista = new ArrayList<>();
        int media = 0;
        double resultado;

        try {
            resultado = myTesting.calcularMedia(lista);
        } catch (IllegalArgumentException e) {
            resultado = 0;
        }

        assertEquals(resultado, media);
    }

    @Test
    public void testCalcularMediaNull() {
        MyTesting myTesting = new MyTesting();
        List<Integer> lista = null;
        int media = 0;
        double resultado;

        try {
            resultado = myTesting.calcularMedia(lista);
        } catch (IllegalArgumentException e) {
            resultado = 0;
        }

        assertEquals(resultado, media);
    }

    @Test
    public void testConvertirListaAString() {
        MyTesting myTesting = new MyTesting();
        List<String> lista = new ArrayList<>(Arrays.asList("abeja", "oveja", "oso", "carpincho"));
        String listaString = "ABEJA,OVEJA,OSO,CARPINCHO";

        String resultado = myTesting.convertirListaAString(lista);

        assertEquals(listaString, resultado);
    }

    @Test
    public void testConvertirListaAStringNull() {
        MyTesting myTesting = new MyTesting();
        List<String> lista = new ArrayList<>(Arrays.asList(null, "oveja", "oso", "carpincho"));
        String listaString = "NULL,OVEJA,OSO,CARPINCHO";

        String resultado = myTesting.convertirListaAString(lista);

        assertEquals(listaString, resultado);
    }

}

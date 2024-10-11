package com.testing.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class MyTestingTests {

    public int sumar(int a, int b) {
        return a + b;
    }

    @Test
    public void testSumar() {
        //Example example =  new Example(); crear el objecto example
        // Given - Teniendo
        int num1 = 35; //parametros
        int num2 = 79;

        // When - Cuando
        int result = sumar(num1, num2);

        // Then - Entonces
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckNegative() {
        //given negative number
        int num = -99;

        //when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                MyTesting.checkPositivo(num);
            }
        });

        //then
        assertEquals("El número no puede ser negativo", exception.getMessage());


    }

    @Test
    public void testCheckPositive() {
        //given positive numer
        int num = 99;

        //when
        boolean result = MyTesting.checkPositivo(num);

        //then
        assertTrue(result);
    }
}

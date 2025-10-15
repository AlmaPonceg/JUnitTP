package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ValidadorTest {

    @Test
    public void testProcesarTextoException(){
        Validador validador= new Validador();
        Exception exception= assertThrows(IllegalArgumentException.class, ()->
                validador.procesarTexto(null)
        );
        assertEquals("El texto no puede ser nulo", exception.getMessage());
    }
}

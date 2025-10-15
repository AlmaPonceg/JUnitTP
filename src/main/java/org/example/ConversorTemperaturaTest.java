package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversorTemperaturaTest {

    @Test
    public void testConversorCelsiusAFahrenheitCero(){
        ConversorTemperatura conversor= new ConversorTemperatura();
        double resultado=conversor.celsiusAFahrenheit(0);
        assertEquals(32, resultado, 0.001);
    }
    @Test
    public void testCelsiusAFahrenheit_Positivo() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        double resultado = conversor.celsiusAFahrenheit(100);
        assertEquals(212, resultado, 0.001); // 100°C = 212°F
    }
}

package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class CuentaBancariaTest {

    @Test
    public void testDeposito(){
        CuentaBancaria cuenta= new CuentaBancaria(200);
        cuenta.depositar(25);
        assertEquals(225, cuenta.getSaldo());
    }
    @Test
    public void testRetirarDinero() {
        CuentaBancaria cuenta=new CuentaBancaria(100);
        cuenta.retirarDinero(50);
        assertEquals(50, cuenta.getSaldo());
    }

    @Test
    public void testRetirarDineroMayorASaldo(){
        CuentaBancaria cuenta= new CuentaBancaria(200);
        Exception exception= assertThrows(SaldoInsuficienteException.class,()->{
            cuenta.retirarDinero(220);
        });
        assertEquals("Dinero insuficiente para retirar valor ingresado", exception.getMessage());
    }
}

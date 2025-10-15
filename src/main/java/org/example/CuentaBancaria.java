package org.example;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        if(cantidad <=0){
            throw new IllegalArgumentException("La cantidad de dinero debe ser positiva");
        }
        this.saldo+=saldo;
    }

    public void retirarDinero(double cantidad) throws SaldoInsuficienteException{
        if (cantidad <=0){
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
     if(cantidad>saldo){
         throw new SaldoInsuficienteException("Dinero insuficiente para retirar valor ingresado");
     }
     this.saldo-= cantidad;
    }

    public double getSaldo(){
        return saldo;
    }
}

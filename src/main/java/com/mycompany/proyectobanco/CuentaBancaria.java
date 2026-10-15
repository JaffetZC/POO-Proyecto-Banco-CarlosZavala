/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobanco;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    public String numeroCuenta, titular;
    private double saldo;
    private int totalTransacciones;
    
    public CuentaBancaria(String numeroCuenta, String titular, double saldoinicial){
        this.numeroCuenta= numeroCuenta;
        this.titular= titular;
        this.totalTransacciones = 0;
        this.saldo= saldoinicial;
        if(saldoinicial < 0)
        this.saldo= 0.0;
    }
        double getSaldo(){
            return this.saldo;
        }
        int getTotalTransacciones(){
            return this.totalTransacciones;
        }
        String depositar(double monto){
            if(monto <= 0){
                throw new Error("Error, no se pudo realizar la transaccion, valor erroneo");
            }
            if(monto > 0){
                this.saldo += monto;
                this.totalTransacciones += 1;
            }
            return "Transaccion exitosa";
        }
        
        boolean retirar(double monto){
            if(monto > 0 && saldo >= monto){
                this.saldo -= monto;
                this.totalTransacciones += 1;
                System.out.println("Transaccion exitosa");
                return true;
            }
            else{
                System.out.println("Error, monto invalido o saldo insuficiente");
                return false;
            }
        }
        String mostrarDatos(){
            return this.titular+" "+this.numeroCuenta+ " "+this.saldo+" "+this.totalTransacciones;
        }
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobanco;

/**
 *
 * @author Usuario
 */
public class CuentaAhorro extends CuentaBancaria {
    public double tasaInteresAnual;
    private int retirosRealizadosMes = 0;
    private final double comisionPorExceso = 20.0;
    
    CuentaAhorro(String numeroCuenta, String titular, double saldoinicial, double tasaInteresAnual){
        super(numeroCuenta, titular, saldoinicial);
        this.tasaInteresAnual = tasaInteresAnual;
        
    }
    
}

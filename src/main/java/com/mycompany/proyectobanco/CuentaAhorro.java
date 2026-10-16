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
    String retirarConComision(double monto){
        if(retirosRealizadosMes >= 3){
            if(getSaldo() >= monto + this.comisionPorExceso){
                double montoTotal = monto + this.comisionPorExceso;
                retirar(montoTotal);
                retirosRealizadosMes += 1;
                System.out.println("Se ha cobrado una comision por Exceso de de transacciones, comision: "+this.comisionPorExceso);
            }
        }
        else{
            retirar(monto);
            retirosRealizadosMes += 1;
        }
        return "Transaccion Exitosa";
    }
    void aplicarInteresAnual(){
        double montoInteres = (getSaldo()*(this.tasaInteresAnual/100))/12; 
        depositar(montoInteres);
        System.out.println("Se aplico correctamente el interes mensual");
    }
    
}

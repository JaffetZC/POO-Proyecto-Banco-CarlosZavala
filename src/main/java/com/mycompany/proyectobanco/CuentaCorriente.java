/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobanco;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente extends CuentaBancaria{
    public String nombreEmpresa;
    private double limiteSobregiro;
    private double sobregiroUtilizado = 0.0;
    
    CuentaCorriente(String numeroCuenta, String titular, double saldoinicial, String nombreEmpresa, double limiteSobregiro){
        super(numeroCuenta, titular, saldoinicial);
        this.nombreEmpresa = nombreEmpresa;
        this.limiteSobregiro = limiteSobregiro;
    }
    double getLimiteSobregiro(){
        return this.limiteSobregiro;
    }
    double getSobregiroUtilizado(){
        return this.sobregiroUtilizado;
    }
    String retirarConSobregiro(double monto){
        if(getSaldo() > monto){
            retirar(monto);
        }
        else if(getSaldo() < monto && monto < (getSaldo() + (this.limiteSobregiro - this.sobregiroUtilizado))){
            double diferencia = monto - getSaldo();
            retirar(getSaldo());
            this.sobregiroUtilizado += (this.limiteSobregiro*1.03);
        }
        else{
            throw new Error ("Saldo insuficiente o Limite de sobregiro alcanzado");
        }
        return "";
    }
    void pagarSobregiro(double monto){
        if(monto < this.sobregiroUtilizado){
            sobregiroUtilizado -= monto;
        }
        if(monto > this.sobregiroUtilizado){
            depositar(monto - sobregiroUtilizado);
        sobregiroUtilizado = 0;
        }
    }
}

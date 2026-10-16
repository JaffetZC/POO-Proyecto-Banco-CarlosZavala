/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectobanco;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        
        CuentaBancaria miCuenta = new CuentaBancaria("2024203", "Jose Alsares", 3000);
        
        //miCuenta.saldo=5000;
        //Si se intenta acceder directamente a saldo, de error por que saldo esta bloqueado por encapsulamiento

        System.out.println(miCuenta.titular);
        System.out.println(miCuenta.numeroCuenta);
        //En este punto si deja acceder directamente a los atributos por que son publicos
        
        CuentaAhorro cuantaAhorro = new CuentaAhorro();
        
    }
}

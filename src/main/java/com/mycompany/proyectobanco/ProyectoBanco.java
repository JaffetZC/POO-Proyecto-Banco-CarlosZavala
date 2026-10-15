/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectobanco;

/**
 *
 * @author Usuario
 */
public class ProyectoBanco {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("2024203", "Jose Alsare", 500);
        
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1.getTotalTransacciones());
        System.out.println(cuenta1.depositar(400));
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1.retirar(300));
        System.out.println(cuenta1.mostrarDatos());
        System.out.println();
        
    }
}

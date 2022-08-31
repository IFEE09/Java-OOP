package com.mycompany.ejercicio_1;

public class Ejercicio_1 {

    public static void main(String[] args) {
        
        Contador farid = new Contador(1000);
        Contador ruth = new Contador(1000);
        
        farid.decrementarCuenta();
        ruth.aumentarCuenta();
        
        System.out.println("La cuenta actual de Farid es " + farid.getCuenta());
        System.out.println("La cuenta actual de Ruth es " + ruth.getCuenta());

    }
}

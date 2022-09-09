
package com.mycompany.ejercicio_1_farid;

import java.util.Scanner;

public class Contador {
   
    private float cuenta = 0;
    
    //Método constructor con parametros
    public Contador(float cuenta) {
        if (cuenta < 0) {
            System.out.println("La cuenta está siendo creada en negativos, es correcto?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Digite una opción: ");
            Scanner opcion_Digitada = new Scanner(System.in);
            int opcion = opcion_Digitada.nextInt();
            switch (opcion) {
                case 1 -> {
                    this.cuenta = cuenta;
                    System.out.println("La cuenta ha sido creada con éxito con " + this.cuenta + " de saldo. Gracias");
                }
                case 2 -> System.out.println("Error, la cuenta no ha sido creada. Gracias.");
                default -> {
                    System.out.println("Opción invalida.");
                    throw new AssertionError();
                }
            }
        } else {
            this.cuenta = cuenta;
        }
    }
    
    //Método constructor copia
    public Contador(Contador contador_Copia) {
        this.cuenta = contador_Copia.cuenta;
        /*Espacio nuevo*/
    }
    
    public void setCuenta(float cuenta) {
        cuenta = this.cuenta;
    }
    
    public float getCuenta() {
        return this.cuenta;
    }
    
    public void aumentarCuenta() {
        this.cuenta++;
    }
    
    public void decrementarCuenta() {
        this.cuenta--;
    }
    
}

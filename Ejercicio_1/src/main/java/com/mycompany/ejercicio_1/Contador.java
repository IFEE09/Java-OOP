
package com.mycompany.ejercicio_1;
public class Contador {
   
    private float cuenta = 0;
    
    //Constructor con parametros
    public Contador(float cuenta) {
        this.cuenta = cuenta;
    }
    
    //Constructor copia
    public Contador(Contador contador_Copia) {
        this.cuenta = contador_Copia.cuenta;
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

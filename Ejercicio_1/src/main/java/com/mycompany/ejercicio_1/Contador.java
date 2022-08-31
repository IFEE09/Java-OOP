
package com.mycompany.ejercicio_1;
public class Contador {
   
    float cuenta;
    
    //Constructor con parametros
    public Contador(float cuenta) {
        cuenta = this.cuenta;
    }
    
    //Constructor copia
    public Contador(Contador contador_Copia) {
        contador_Copia.cuenta = this.cuenta;
    }
    
    public void setCuenta(float cuenta) {
        this.cuenta = cuenta;
    }
    
    public float getCuenta() {
        return this.cuenta;
    }
    
}

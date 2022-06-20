/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author evert
 */
public class Cliente extends Persona {
    private int dinero;
    private Vendedor vendedor;

    public Cliente(int dinero, String Nombre, String Rut, String Direccion) {
        super(Nombre, Rut, Direccion);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    @Override
    public String identificarse(){
        return getNombre() + getRut();
    }

    @Override
    public void ComprarProducto() {
        super.ComprarProducto(); 
    }

    @Override
    public void AgregarFondos() {
        super.AgregarFondos(); 
    }
    
    
}

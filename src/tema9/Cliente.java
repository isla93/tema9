/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema9;

/**
 *
 * @author ProfVespertino
 */
public class Cliente {
    private int DNi;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setCod(int cod) {
        this.DNI = cod;
    }

    public int getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return true;
    }

    
    
    
    
    
}

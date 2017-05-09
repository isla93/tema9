/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10prac1;

/**
 *
 * @author ProfVespertino
 */
public class Cliente {
    private int dni,telefono;
    private String nombre,apellido,direccion,localizacion,provincia,edad;

    public Cliente(int dni, String edad, int telefono, String nombre, String apellido, String direccion, String localizacion, String provincia) {
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.localizacion = localizacion;
        this.provincia = provincia;
    }

    public Cliente() {
    }
    
    

    public String getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
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
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    
    
    
    
    
}

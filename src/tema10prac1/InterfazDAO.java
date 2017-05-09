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
public interface InterfazDAO {
    public abstract boolean alta(Object o);
    public abstract boolean baja(Object o);
    public abstract boolean modificacion(Object viejo, Object nuevo);
    public abstract Object consulta(Object o);
    public abstract Object primero();
    public abstract Object ultimo();
    public abstract Object siguiente(Object o);
    public abstract Object anterior (Object o);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_10EjerClase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author ProfVespertino
 */
public class ClienteColeccionDAO<T> implements InterfazDAO {

    private LinkedHashSet<T> lista;

    public ClienteColeccionDAO() {
        lista = new LinkedHashSet<T>();
    }

    @Override
    public boolean alta(Object o) {
        T aux = (T) o;
        lista.add(aux);
        return true;

    }

    @Override
    public boolean baja(Object o) {
        T aux = (T) o;
        lista.add(aux);
        return true;
    }

    @Override
    public boolean modificacion(Object viejo, Object nuevo) {
        T aux = (T) viejo;
        T aux1 = (T) nuevo;
        if (lista.contains(aux1)) {
            return false;
        } else {
            lista.remove(aux);
            lista.add(aux1);
            return true;
        }

    }

    @Override
    public Object consulta(Object o) {

        T aux = (T) o;
        Iterator<T> it = lista.iterator();
        while (it.hasNext()) {
            aux = it.next();
            if (aux.equals(o)) {
                return aux;
            }
        }
        return null;
    }

    @Override
    public Object primero() {
        ArrayList<T> arraylistcli= new ArrayList<>(lista);
        return arraylistcli.get(0);
    }

    @Override
    public Object ultimo() {
        ArrayList<T> arraylistcli= new ArrayList<>(lista);
        return arraylistcli.get(arraylistcli.size());
    }

    @Override
    public Object siguiente(Object o) {
        int i=0;
        ArrayList<T> arraylistcli= new ArrayList<>(lista);
        while (i< arraylistcli.size())
                if(arraylistcli.get(i).equals(o)){
                    i++;
                    return arraylistcli.get(i);
                }
                else{
                        i++;
                        }
        return false;
    }

    @Override
    public Object anterior(Object o) {
        int i=0;
        ArrayList<T> arraylistcli= new ArrayList<>(lista);
        while (i< arraylistcli.size())
                if(arraylistcli.get(i).equals(o)){
                    i--;
                    return arraylistcli.get(i);
                }
                else{
                        i++;
                        }
        return false;

    }
}
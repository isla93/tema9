package tema10prac1;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDAO<T> implements InterfazDAO {

    private LinkedHashSet<T> lista;

    public LinkedHashSetDAO() {
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
        lista.remove(aux);
        return true;

    }

    @Override
    public boolean modificacion(Object viejo, Object nuevo) {
        LinkedHashSet<T> aux = new LinkedHashSet<T>();
        T v = (T) viejo;
        T c = null;
        T n = (T) nuevo;
        try {
           
                Iterator<T> it = lista.iterator();

                while (it.hasNext()) {
                    c = it.next();
                    if (c.equals(v)) {
                        aux.add(n);
                       
                    } else {
                        aux.add(c);
                    }
                }
                lista = aux;
                return true;
            
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public Object consulta(Object o) {
        T c = (T) o;
        T xd = null;
        try {
            Iterator<T> it = lista.iterator();

            while (it.hasNext()) {
                xd = it.next();
                if (c.equals(xd)) {
                    return xd;
                }
            }
        } catch (Exception e) {
            
        }

        return xd;
    }

    @Override
    public Object primero() { 
        T c = null;
        try {
            Iterator<T> it = lista.iterator();

            while (it.hasNext()) {
                c = it.next();
                break;
            }
            return c;
        } catch (Exception e) {
        }
        return c;
    }

    @Override
    public Object ultimo() {
        T c = null;
        try {
            c = (T) lista.toArray()[lista.size() - 1];

        } catch (Exception e) {

        }
        return c;
    }

    @Override
    public Object siguiente(Object o) {
        int n = 0;
        T c = (T) o;
        T x=null;
        try{
        Iterator<T> it = lista.iterator();

        while (it.hasNext()) {
            x = it.next();
            if (x.equals(c)) {
                break;
            }
            n++;
        }
        x = (T) lista.toArray()[n + 1];
        return x;
        }catch(Exception e)
        {
        }
        return x;
    }

    @Override
    public Object anterior(Object o) {
        int n = 0;
        T c = (T) o;
        T x=null;
        try{
        Iterator<T> it = lista.iterator();

        while (it.hasNext()) {
            x = it.next();
            if (x.equals(c)) {
                break;
            }
            n++;
        }
        x = (T) lista.toArray()[n - 1];
        return x;
        }catch(Exception e)
        {
        }
        return x;
    }

}

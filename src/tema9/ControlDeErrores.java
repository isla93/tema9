package tema9;

import java.util.*;

public class ControlDeErrores {

    int[] sobras;

    public ControlDeErrores() {
        sobras = new int[10];
    }

    public String metodo1(int dividendo, int divisor) {
        int resto;
        if (divisor != 0) {
            sobras[0]=dividendo / divisor;
            resto = dividendo - (dividendo / divisor) * divisor;
            sobras[1]=resto;

        }
        return "cociente="+sobras[0]+"  resto="+sobras[1];
    }

    public String metodo2(int dividendo, int divisor) {

        try {
            sobras[0]=dividendo /  divisor;
            sobras[1]=dividendo % divisor;

        } catch (NumberFormatException nfe) {
            System.out.println("error");
        } finally {
            return "cociente="+sobras[0]+"  resto="+sobras[1];
        }
    }

}

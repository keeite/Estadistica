/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica.modelo;

import estadistica.modelo.Articulo;
import java.util.Comparator;

/**
 *
 * @author a071768530c
 */
public class NombreComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Articulo c = (Articulo) o1;
        if (o2 instanceof Articulo) {
            Articulo c2 = (Articulo) o2;
            return c.getNombre().compareTo(c2.getNombre());
        } else {
            String s = o2.toString();
            return c.getNombre().compareTo(s);
        }
    }
}

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
 * @author a048598270y
 */
public class CantidadComparator implements Comparator<Articulo> {

    @Override
    public int compare(Articulo c1, Articulo c2) {
        if (c1.getCantidad()> c2.getCantidad()) {
            return 1;
        }
        if (c1.getCantidad() < c2.getCantidad()) {
            return -1;
        }
        return 0;
    }
    
    
}

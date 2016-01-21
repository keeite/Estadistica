
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica.modelo;

import java.util.ArrayList;

/**
 *
 * @author Programador
 */
public class Formulas {

    public Formulas() {

    }

    public int cantArti(ArrayList<Articulo> articulos) {
        return articulos.size();
    }

    /**
     * Metodo para sumar cantidades de articulos del array
     *
     * @param articulos array de articulos
     * @return devuelve la cantidad
     */
    public int cantTotal(ArrayList<Articulo> articulos) {
        int cantidad = 0;

        for (int i = 0; i < articulos.size(); i++) {
            cantidad += articulos.get(i).getCantidad();
        }

        return cantidad;
    }

}

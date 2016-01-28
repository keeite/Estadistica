
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica.modelo;

import java.util.List;

/**
 *
 * @author Programador
 */
public class Formulas {

    List<Articulo> articulos;

    public Formulas(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public int cantArti() {
        return articulos.size();
    }

    /**
     * Metodo para sumar cantidades de articulos del array
     *
     * @param articulos array de articulos
     * @return devuelve la cantidad
     */
    public int cantTotal() {
        int cantidad = 0;

        for (int i = 0; i < articulos.size(); i++) {
            cantidad += articulos.get(i).getCantidad();
        }

        return cantidad;
    }

    /**
     * Metodo para sumar precios de articulos del array
     *
     * @param articulos array de articulos
     * @return devuelve el precio total
     */
    public float precioTotal() {
        float cantidad = 0f;

        for (int i = 0; i < articulos.size(); i++) {
            cantidad += articulos.get(i).getPrecio_unidad();
        }

        return cantidad;
    }

    /**
     * Metodo calcular la media de articulos del array
     *
     * @param artiMedia array de articulos exclusivamente para la media
     * @return devuelve el precio total
     */
    private float mediaCant() {
        float media;

        media = cantTotal() / cantArti();

        return media;
    }

    /**
     * Metodo calcular la media de precios de los articulos del array
     *
     * @param artiMedia array de articulos exclusivamente para la media
     * @return devuelve el precio total
     */
    public float mediaPrecio() {
        float media;

        media = precioTotal() / cantArti();

        return media;
    }

    public float precioMax() {
        float max = 0;

        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getPrecio_unidad() > max) {
                max = articulos.get(i).getPrecio_unidad();
            }
        }
        return max;
    }

    public float precioMin() {
        float min = 0;
        float max = precioMax();

        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getPrecio_unidad() < max) {
                min = articulos.get(i).getPrecio_unidad();
            }
        }
        return min;
    }

    public int moda() {
        int repite = 0, moda = 0;

        for (int i = 0; i < articulos.size(); i++) {
            int seRepite = 0;
            for (int j = 0; j < articulos.size(); j++) {
                if (articulos.get(i).getCantidad() == articulos.get(j).getCantidad()) {
                    seRepite++;
                }
            }
            if (seRepite > repite) {
                moda = articulos.get(i).getCantidad();
                repite = seRepite;
            }
        }
        return moda;
    }

    public float varianza() {
        float varianza = 0, rango;

        for (int i = 0; i < articulos.size(); i++) {
            rango = (float) Math.pow(articulos.get(i).getCantidad() - mediaCant(), 2f);
            varianza += rango;
        }
        varianza = varianza / articulos.size();

        return varianza;
    }

}

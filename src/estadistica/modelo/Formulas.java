
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
    
    /**
     * Metodo para sumar precios de articulos del array
     *
     * @param articulos array de articulos
     * @return devuelve el precio total
     */
    public int precioTotal(ArrayList<Articulo> articulos) {
        int cantidad = 0;

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
    public float mediaCant(ArrayList<Articulo> artiMedia) {
        float media;
        
        media = cantTotal(artiMedia) / cantArti(artiMedia);
        
        return media;
    }
    
    /**
     * Metodo calcular la media de precios de los articulos del array
     *
     * @param artiMedia array de articulos exclusivamente para la media
     * @return devuelve el precio total
     */
    public float mediaPrecio(ArrayList<Articulo> artiMedia) {
        float media;
        
        media = precioTotal(artiMedia) / cantArti(artiMedia);
        
        return media;
    }
    
    public float precioMax(ArrayList<Articulo> articulos) {
        float max = 0;
                
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getPrecio_unidad() > max) {
                max = articulos.get(i).getPrecio_unidad();
            }
        }
        return max;
    }
    
    public float precioMin(ArrayList<Articulo> articulos) {
        float min = 0;
                
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getPrecio_unidad() < min) {
                min = articulos.get(i).getPrecio_unidad();
            }
        }
        return min;
    }
    
    public int moda(ArrayList<Articulo> articulos) {
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
    
    public float varianza(ArrayList<Articulo> articulos) {
        float varianza = 0, rango;
        
        for(int i = 0 ; i < articulos.size(); i++){
            rango = (float) Math.pow(articulos.get(i).getCantidad() - mediaCant(articulos), 2f);
            varianza += rango;
        }
        varianza = varianza / articulos.size();
        
        return varianza;
    }
    
}
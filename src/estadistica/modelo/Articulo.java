/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica.modelo;

/**
 *
 * @author a048598270y
 */
public class Articulo {

    private final String nombre;
    private int cantidad;
    private float precio_unidad;

    public Articulo(String nombre, int cantidad, float precio_unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio_unidad = precio_unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio_unidad() {
        return precio_unidad;
    }

    public float getPrecioTotal() {
        return cantidad * precio_unidad;

    }

    public float getPrecioTotalIVA() {
        return (cantidad * precio_unidad) * 1.21f;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_unidad(float precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

}

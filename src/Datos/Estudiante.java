package Datos;

import Modelo.Base;

public class Estudiante extends Base{

    private String nombre;
    private String carrera;
    private int codigo;

    public Estudiante(String nombre, String carrera, int codigo) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.codigo = codigo;
    }

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Get the value of carrera
     *
     * @return the value of carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Set the value of carrera
     *
     * @param carrera new value of carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + carrera + codigo;
    }
    
    

    @Override
    public Base copy() {
        return new Estudiante(nombre, carrera, codigo);
    }

}

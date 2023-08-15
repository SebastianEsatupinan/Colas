package Datos;

import Modelo.Base;
        
public class Cliente extends Base{
    
    private String nombre;
    private String telefono;
    private int codigo;

    public Cliente(String nombre, String telefono, int codigo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.codigo = codigo;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + ", " + telefono + ", " + codigo+ "\n";
    }

    @Override
    public Base copy() {
        return new Cliente(nombre, telefono, codigo);
    }

    
}

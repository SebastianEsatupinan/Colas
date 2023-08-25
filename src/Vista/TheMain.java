package Vista;

import Datos.Cliente;
import Modelo.Cola;
import Modelo.OperacionCola;


public class TheMain {

    public static void main(String[] args) {
        
        Cola<Cliente> colaOriginal = new Cola<>();
        colaOriginal.encolar(new Cliente("sebas", "3456", 1500));
        colaOriginal.encolar(new Cliente("nata", "2233", 2000));
        colaOriginal.encolar(new Cliente("alex", "5678", 2500));
        System.out.println("Cola Original " + colaOriginal.toString());

        Cola<Cliente> colaDuplicada = OperacionCola.duplicarCola(colaOriginal);
        System.out.println("Cola Duplicada " + colaDuplicada.toString());

        colaOriginal.desencolar();
        System.out.println("Pila Original modificada " + colaOriginal.toString());
        System.out.println("Pila Duplicada " + colaDuplicada.toString());
        Cola<Cliente> colaOriginalP = new Cola<>();
    }
    
}

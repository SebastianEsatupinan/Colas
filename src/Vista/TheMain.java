package Vista;

import Datos.Cliente;
import Modelo.Cola;


public class TheMain {

    public static void main(String[] args) {
        
        Cola<Cliente> colaP1 = new Cola<>();
        
        colaP1.encolar(new Cliente("Sebas" ,"418435 ", 456778));
        colaP1.encolar(new Cliente("Nata ","46543 ", 1325213));
        colaP1.encolar(new Cliente("Daniel ","123443 ", 65433));
        colaP1.encolar(new Cliente("Jorge ","87643 ", 987544));
        
        System.out.println("Cola Original \n" + colaP1.toString());
        
        colaP1.desencolar();
        
        System.out.println("Cola Modificada \n" + colaP1.toString());
    }
    
}

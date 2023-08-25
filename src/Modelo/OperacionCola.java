package Modelo;

public class OperacionCola {
    public static <T extends Base> Cola<T> duplicarCola (Cola<T> colaOriginal){
        Cola<T> colaAux = new Cola<>();
        Cola<T> colaDuplicada = new Cola<>();
        while (!colaOriginal.estaVacia()) {
            T elemento = colaOriginal.desencolar();
            colaAux.encolar(elemento);
        }
        while (!colaAux.estaVacia()) {
            T elementoOriginal = colaAux.desencolar();
            T elementoCopiado = (T) elementoOriginal.copy();
            colaOriginal.encolar(elementoOriginal);
            colaDuplicada.encolar(elementoCopiado);
        }
        return colaDuplicada;
    }
    
     public static <T extends Base> Cola<T> colaResultado(Cola<T> pilaOriginal) {

        Cola<T> pilaDuplicada =duplicarCola(pilaOriginal);
        Cola<T> pilaResultado = new Cola<>();
        int indice=0;
        while (!pilaDuplicada.estaVacia()) {  
            T elemeneto=pilaDuplicada.desencolar();
            if(indice % 2 ==0){
                pilaResultado.encolar(elemeneto);
            }
            indice++;
        }

        return pilaResultado;
    }
}

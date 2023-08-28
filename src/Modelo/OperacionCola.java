package Modelo;

import Datos.Estudiante;

public class OperacionCola {

    public static <T extends Base> Cola<T> duplicarCola(Cola<T> colaOriginal) {
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

    public static <T extends Base> Cola<T> colaResultado(Cola<T> colaOriginal) {

        Cola<T> colaDuplicada = duplicarCola(colaOriginal);
        Cola<T> colaResultado = new Cola<>();
        while (!colaDuplicada.estaVacia()) {
            T elemento = colaDuplicada.desencolar();
            Estudiante objE = (Estudiante) elemento;
            String carrera = objE.getCarrera();
            if (carrera.contains("Ingeniero")) {
                colaResultado.encolar(elemento);
            }
        }
        return colaResultado;
    }

    public static <T extends Base> Cola<T> colaResultado2(Cola<T> pilaOriginal) {

        Cola<T> colaDuplicada = duplicarCola(pilaOriginal);
        Cola<T> colaResultado = new Cola<>();
        int indice = 0;
        while (!colaDuplicada.estaVacia()) {
            T elemeneto = colaDuplicada.desencolar();
            if (indice % 2 != 0) {
                colaResultado.encolar(elemeneto);
            }
            indice++;
        }

        return colaResultado;
    }
}

package Modelo;

import java.util.LinkedList;

public class Cola <T extends Base>{
    
    private LinkedList<T> tope;

    public Cola() {
       tope = new LinkedList<>();
    }
    
    public void encolar (T elemento){
        tope.addLast(elemento);
    }
    
    public T desencolar (){
        return tope.removeFirst();
    }
    
     public Boolean encolar(){
        return tope.isEmpty();
    }
     
     @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder("{");
        
        for(T elemento : tope){
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}

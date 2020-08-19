package Estructuras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;

public class Lista<T> implements Serializable{
    
    Nodo<T> primero;
    int tamano;
    
    public void agregarFinal(T valor){
    
        if(primero == null){
            primero = new Nodo<>(valor);
        }
        else{
            
            Nodo<T> aux = primero;
            
            while(aux.siguiente != null){
                aux = aux.siguiente;
            }
            
            aux.siguiente = new Nodo<>(valor);
            
        }
        
        tamano++;
        
    }

    public int getTamano() {
        return tamano;
    }
    
    public T get(int i){
        
        if(i < 0 || i >= tamano || vacia())
            return null;
        
        Nodo<T> aux = primero;
        int posicion = 0;
        
        while(posicion != i){
            aux = aux.siguiente;
            posicion++;
        }
        
        return aux.valor;
        
    }
    
    public boolean vacia(){
        return tamano == 0;
    }
    
    @Override
    public String toString(){
        
        StringBuilder sb = new StringBuilder();
        
        Nodo<T> aux = primero;
        
        while(aux != null){
            sb.append("[").append(aux.valor.toString()).append("]");
            aux = aux.siguiente;
        }
        
        return sb.toString();
        
    }
    
    
    public String[] toArray(){
        
        if(this.tamano == 0){
            return new String[]{"Sin elementos"};
        }
        
        String[] arreglo = new String[tamano];
        Nodo aux = primero;
        int i = 0;
        
        while(aux != null){
            arreglo[i] = aux.valor.toString();
            aux = aux.siguiente;
            i++;
        }
        
        return arreglo;
    }
    
}

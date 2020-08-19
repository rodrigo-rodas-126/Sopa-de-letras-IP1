package Estructuras;




import java.io.Serializable;

public class Nodo<T> implements Serializable{
    
    
    T valor;
    Nodo<T> siguiente;
    Nodo<T> anterior;
    Lista lista;
    
    public Nodo(T valor){
        this.valor = valor;
        lista = new Lista();
    }
    
    public void agregarInterna(int valor){
        lista.agregarFinal(valor);
    }
    
}

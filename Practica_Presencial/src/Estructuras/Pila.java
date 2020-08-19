package Estructuras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Pila<T> extends Lista{
	
	public void Push(T valor){
            this.agregarFinal(valor);
	}

	public T Pop(){
		if(vacia())
			return null;

		else if(primero.siguiente == null){
			tamano--;
			T valor = (T) primero.valor;
			primero=null;
			return valor;
		}

		Nodo<T> aux = primero.siguiente;
		Nodo<T> anterior = primero;

		while(aux.siguiente != null){
			anterior = aux;
			aux = aux.siguiente;
		}
		
		tamano--;
		anterior.siguiente = null;
		return aux.valor;
	}

	public T Peek(){
		if(vacia())
			return null;

		Nodo<T> aux = primero;
		while(aux.siguiente != null){
			aux = aux.siguiente;
		}

		return aux.valor;
	}
}

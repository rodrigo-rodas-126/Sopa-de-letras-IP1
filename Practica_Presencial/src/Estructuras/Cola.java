/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Rodrigo
 */
public class Cola<T> extends Lista{
	
	public void Queue(T valor)	{
		Nodo<T> aux = this.primero;
		this.primero = new Nodo<>(valor);
		this.primero.siguiente = aux;
	}

	public T Dequee(){
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
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Nestor
 */
public class Pila<E> {
    Nodo cima;
    int tamaño;
    
    public Pila(){
        cima = null;
        tamaño = 0;
    }
    
    public void Push(E elemento){
        Nodo aux = new Nodo(elemento);
        aux.siguiente = cima;
        cima = aux;
        tamaño += 1;
    }
    
    public Nodo Pop(){
        Nodo aux = new Nodo(null);
        if(EstaVacia() == false){
            aux = cima;
            cima = cima.siguiente;
            tamaño -= 1;
            return aux;
        }else{
            System.out.println("La pila está vacía");
        }
        return aux;
    }
    
    public boolean EstaVacia(){
        return (cima == null);
    }
    
    public E CimaPila(){
        return (E) cima.info;
    }
    
    public int Tamaño(){
        return tamaño;
    }
    
    public void Mostrar(){
        Nodo aux = cima;
        if(!EstaVacia()){
            while(aux.siguiente != null){
                System.out.println(aux.info.toString());
                aux = aux.siguiente;
            }
            System.out.println(aux.info.toString());
        }else{
            System.out.println("La pila está vacía");
        }
    }
}

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
public class Dipolo<E> {
    Nodo frente;
    Nodo fondo;
    int tamaño;
    
    public Dipolo(){
        frente = null;
        fondo = null;
        tamaño = 0;
    }
    
    public boolean EstaVacia(){
        return((frente == null || fondo == null));
    }
    
    public void AñadirFondo(E elemento){
        if(EstaVacia()){
            frente = new Nodo(elemento);
            tamaño += 1;
            fondo = frente;
        }else{
            fondo.siguiente = new Nodo(elemento);
            fondo = fondo.siguiente;
            tamaño += 1;
        }
    }
    
    public void AñadirFrente(E elemento){
        if(EstaVacia()){
            frente = new Nodo(elemento);
            tamaño += 1;
            fondo = frente;
        }else{
            Nodo aux = new Nodo(elemento);
            aux.siguiente = frente;
            frente = aux;
            tamaño += 1;
        }
    }
    
    public Nodo QuitarFondo(){
        if(!EstaVacia()){
            Nodo aux = frente;
            if(frente == fondo){
                frente = null;
                fondo = null;
                tamaño -= 1;
                return aux;
            }
            while(aux.siguiente != fondo){
                aux = aux.siguiente;
            }
            fondo = aux;
            aux = aux.siguiente;
            fondo.siguiente = null;
            tamaño -= 1;
            return aux;
        }
        return null;
    }
    
    public Nodo QuitarFrente(){
        if(!EstaVacia()){
            Nodo aux = frente;
            if(frente == fondo){
                frente = null;
                fondo = null;
                tamaño -= 1;
                return aux;
            }else{
                frente = frente.siguiente;
                tamaño -= 1;
                return aux;
            }
        }
        return null;
    }
    
    public void Mostrar(){
        Nodo aux = frente;
        if(!EstaVacia()){
            while(aux.siguiente != null){
                System.out.println(aux.info.toString());
                aux = aux.siguiente;
            }
            System.out.println(aux.info.toString());
        }else{
            System.out.println("El dipolo está vacío");
        }
    }
    
    public <E> E getFrente(){
        return (E) frente.info;
    }
    
    public <E> E getFondo(){
        return (E) fondo.info;
    }
}



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
public class Nodo<E>{
    E info;
    Nodo siguiente;
    
    public Nodo(E elemento){
        this.info = elemento;
        this.siguiente = null;
    }
}

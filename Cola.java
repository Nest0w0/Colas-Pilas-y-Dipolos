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
public class Cola<E> {
    Nodo frente;
    Nodo fondo;
    int tamaño;
    int limite;
    
    public Cola(int limite){
        this.frente = null;
        this.fondo = null;
        this.tamaño = 0;
        this.limite = limite;
    }
    
    public Cola(){
        this.frente = null;
        this.fondo = null;
        this.tamaño = 0;
        this.limite = 1000000000;
    }
    
    public void Encolar(E info){
        Nodo nuevo_nodo = new Nodo(info);
        if(this.tamaño <= this.limite){
            if(estaVacia()){
                this.frente = nuevo_nodo;
            }else{
                this.fondo.siguiente = nuevo_nodo;
            }
            this.fondo = nuevo_nodo;
            this.tamaño += 1;
        }
        else{
            //EXCEPCIÓN
        }
    }
    
        public Nodo Desencolar(){
            Nodo aux_nodo = new Nodo(null);
            if(!estaVacia()){
                aux_nodo = this.frente;
                this.frente = this.frente.siguiente;
                this.tamaño -= 1;
            }
            else{
                //EXCEPCIÓN
            }
            return aux_nodo;
        }
    
        public boolean estaVacia(){
            if(this.frente == null){
                return true;
            }
            else{
                return false;
            }
        }
        
        public void Mostrar(){
            Nodo aux = this.frente;
            if (!estaVacia()){
                while(aux.siguiente != null){
                    System.out.println(aux.info.toString());
                    aux = aux.siguiente;
                }
                 System.out.println(aux.info.toString());
            }
            System.out.println("La cola está vacía");
        }
}

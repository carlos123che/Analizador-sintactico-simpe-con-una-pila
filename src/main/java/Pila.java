/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author car12
 */
public class Pila {
    private Nodo lastElement;

    public Pila() {
        this.lastElement = null;
    }
    
    public void insert(char x){
        Nodo newNodo = new Nodo();
        newNodo.info = x;
        
        if(this.lastElement==null){
            newNodo.next = null;
            this.lastElement = newNodo;
        }else{
            newNodo.next = this.lastElement;
            this.lastElement = newNodo;
        }
    }
    
    public char pop(){
        if (this.lastElement != null) {
            char info = this.lastElement.info;
            this.lastElement = this.lastElement.next;
            return info;
        }else{
            return Character.MAX_VALUE;
        }
    }
    
    public boolean isEmpty(){
        return this.lastElement == null;
    }
    
}

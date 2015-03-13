/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_200715324;

/**
 *
 * @author ayau1_000
 */
public class ListaJugadores {
    class Nodo {
        String nombre;
        int cantidad;
        Lista extra;
        Nodo sig;
    }
    
    class Lista {
        String texto;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    public ListaJugadores(){
        raiz=null;
    }
    
    public void insertarJugador(String n,int x){
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.nombre = n;
        nuevo.cantidad = x;
        if(raiz==null){
            nuevo.sig = null;
            raiz = nuevo;
        }else{
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    public void insertarCampoExtra(String texto){
        
    }
}

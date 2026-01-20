/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejemploarbolbinario;

/**
 *
 * @author PERSONAL
 */
public class ArbolGeneral <N> {
    
    private Nodo<N> raiz;
    
    public ArbolGeneral(){
        
        this.raiz= null;
    }
    
    public Nodo<N> getRaiz(){
        
        return raiz;
    }
    
    
    public void insertar(N valor ){
        
        raiz= insertarRec(raiz, valor);
    }
    
    private Nodo<N> insertarRec(Nodo<N> actual,N valor ){
        if(actual==null)return new Nodo ( valor);
        
        if(valor.equals(actual.valor )){
           actual.izquierdo=insertarRec(actual.izquierdo, valor);
      
        }else{
            
            actual.derecho=insertarRec(actual.derecho,valor);
        }
        return actual;
    }
    
    public void mostrar(){
        mostrar(raiz);
    
    }
    
     public void mostrar(Nodo<N> actual){
        if(actual == null) return;
        System.out.println(actual.valor);
        mostrar(actual.izquierdo);
        mostrar(actual.derecho);
      
    }
    
}

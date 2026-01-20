/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejemploarbolbinario;

/**
 *
 * @author PERSONAL
 */
public class Nodo <N> {
    public N valor;
      public Nodo <N> izquierdo;
      public Nodo  <N>derecho;

    public Nodo(N valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
    
}

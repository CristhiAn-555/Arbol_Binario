/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.ejemploarbolbinario;

/**
 *
 * @author PERSONAL
 */
public class EjemploArbolBinario {

    public static void main(String[] args) {
        ArbolGeneral<Integer> arbol = new ArbolGeneral<>();
        
        
        arbol.insertar(9);
        arbol.insertar(4);
        arbol.insertar(15);
        arbol.insertar(3);
        
        arbol.mostrar();
    }
}

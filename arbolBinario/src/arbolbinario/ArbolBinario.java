/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

import java.util.List;

/**
 *
 * @author Asus
 */
public class ArbolBinario {

    public static void main(String[] args) {
        
        //Calcular la altura de un arbol Binario
        alturaArbolBinario tree = new alturaArbolBinario();
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);
        tree.root.right.left = tree.new Node(6);
        tree.root.right.right = tree.new Node(7);
        tree.root.left.left.left = tree.new Node(8);
        tree.root.left.right.right = tree.new Node(9);
        tree.root.right.left.left = tree.new Node(10);
        tree.root.right.right.right = tree.new Node(11);
        tree.root.right.right.right.right = tree.new Node(12);
 
        System.out.println("Altura del arbol binario: " + tree.height(tree.root));
        
        /*-----------------------------------------------------------------------------------*/
        
        System.out.println(""); 
        
        //Calcular el numero de nodos de un arbol
        nodosArbolBinario nodos = new nodosArbolBinario();
        nodos.root = nodos.new Node(1);
        nodos.root.left = nodos.new Node(2);
        nodos.root.right = nodos.new Node(3);
        nodos.root.left.left = nodos.new Node(4);
        nodos.root.left.right = nodos.new Node(5);
        nodos.root.right.left = nodos.new Node(6);
 
        System.out.println("Numero de nodos del árbol binario: " + nodos.countNodes(nodos.root));
        
        /*--------------------------------------------------------------------------------------*/
        
        System.out.println("");
        
        /*--------------------------------------------------------------------------------------*/
        
        //Ordenar numeros de mayor a menor
        ordenarValoresArbolBinario bst = new ordenarValoresArbolBinario();
        bst.insert(10);
        bst.insert(32);
        bst.insert(8);
        bst.insert(11);
        bst.insert(1);

        List<Integer> values = bst.getValuesDescending();
        System.out.println("Valores ordenados de mayor a menor: " + values);
    }
    
}

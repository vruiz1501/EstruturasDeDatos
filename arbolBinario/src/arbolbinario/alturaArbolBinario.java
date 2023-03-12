/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolBinario.src.arbolbinario;

/**
 *
 * @author Asus
 */
public class alturaArbolBinario {
    
     Node root;
 
    // Clase interna para representar un nodo del árbol binario
    class Node {
        int data;
        Node left, right;
 
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
 
    // Función para calcular la altura del árbol binario
    public int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
 
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @author Asus
 */
public class nodosArbolBinario {
    
    Node root;
 
    class Node {
        int data;
        Node left, right;
 
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
 
    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftCount = countNodes(node.left);
            int rightCount = countNodes(node.right);
 
            return leftCount + rightCount + 1;
        }
    }
}

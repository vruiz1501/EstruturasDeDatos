/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolBinario.src.arbolbinario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ordenarValoresArbolBinario {
    
        Node root;

    // Clase interna para representar un nodo del árbol binario de búsqueda
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Función para insertar un valor en el árbol binario de búsqueda
    public void insert(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertNode(root.left, value);
        } else if (value > root.data) {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    // Función para obtener los valores almacenados en el árbol binario de búsqueda, ordenados de mayor a menor
    public List<Integer> getValuesDescending() {
        List<Integer> values = new ArrayList<Integer>();
        getValuesDescendingHelper(root, values);
        return values;
    }

    private void getValuesDescendingHelper(Node node, List<Integer> values) {
        if (node != null) {
            getValuesDescendingHelper(node.right, values);
            values.add(node.data);
            getValuesDescendingHelper(node.left, values);
        }
    }
}

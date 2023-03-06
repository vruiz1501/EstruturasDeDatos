public class Pruebas {
    public static void main(String[] args) {

        Node root = new Node();
        root.generateTreeToFile();

        int obtenerPeso  = Node.peso(root);
        System.out.println("Peso del Arbol: " + obtenerPeso);


        System.out.println("Print in order");
        root.printInOrder();
        System.out.println("Print pos order");
        root.printPosOrder();
        System.out.println("Print pre order");
        root.printPreOrder();


        Node a = new Node(1,"Bogota");
         a.add(5,"Medellin");
         a.add(15,"Cali");
         a.add(8,"Manizales");


        Node b = new Node(1,"Bogota");
        b.add(5,"Medellin");
        b.add(15,"Cali");
        b.add(8,"Manizales");

        System.out.println("Los Arboles son iguales: " + Node.isIdentical(a,b));


        Node e = new Node(1,"Bogota");
        e.add(5,"Medellin");
        e.add(15,"Cali");
        e.add(8,"Manizales");


        Node f = new Node(1,"Bogota");
        b.add(5,"Buebaventura");
        b.add(15,"Cali");
        b.add(8,"Manizales");

        System.out.println("Los Arboles son iguales: " + Node.isIdentical(e,f));

        Node c = null;
        Node d = null;

        System.out.println("Los Arboles son iguales: " + Node.isIdentical(c,d));

    }

    public static void printTree(){


    }


}

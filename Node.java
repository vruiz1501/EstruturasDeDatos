import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Optional;

public class Node {
    private Integer value;
    private Node left;
    private Node right;
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Node(Integer value, String word) {
        this.value = value;
        this.word = word;
    }

    public Node(){

    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void add(Integer value, String word) {
        if (this.value == null && this.word == null ){
            this.value = value;
            this.word = word;
        }else{
            if (value < this.value) {
                if (left != null) {
                    left.add(value,word);
                } else {
                    left = new Node(value,word);
                }
            } else {
                if (right != null) {
                    right.add(value,word);
                } else {
                    right = new Node(value,word);
                }
            }
        }

    }

    private  Optional<Node> findWord( String word) {
        if (word.equals(this.word)) {
            return Optional.of(this);
        }
        if (left != null) {
            left.findWord(left.word);
        }
        if (right != null) {
            right.findWord(right.word);
        }
        return Optional.empty();
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(value + " " + word);
        if (right != null) {
            right.printInOrder();
        }
    }



    public void printPreOrder() {
        System.out.println(value +" "+ word);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPosOrder() {
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
        System.out.println(value + " " +word);
    }



    public static int peso(Node node){
        int cantNode = 0;
        if (node.left == null && node.right == null) {
            return 1;
        }else{
            if (node.left!=null) {
                cantNode += peso(node.left);
            }
            if (node.right!=null) {
                cantNode += peso(node.right);
            }return cantNode;
        }
    }

    public static boolean isIdentical(Node a , Node b){
        if (a == null && b == null) {
            return true;
        }

        return (a != null && b != null) && (a.value == b.value) &&
                isIdentical(a.left, b.left) &&
                isIdentical(a.right, b.right);
    }

    public void generateTreeToFile(){
        String[] words = Node.readFile();
        for (int i=0; i<words.length ; i++){
            String word = words[i];
            if(!findWord(word).isPresent()){
                add(numberWordRepeated(word,words),word);
            }
        }

    }

    public static String[] readFile() {
        String salida[] = null;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("C:\\Users\\LENOVO L480\\IdeaProjects\\EstruturasDeDatos\\frase.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea = br.readLine();
            salida = linea.split(" ");

        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return salida;
    }

    private static int numberWordRepeated(String word, String[] words){
        int cont  = 0;
        for(String w : words){
            if(word.equals(w)) {
                cont++;
            }
        }
        return cont;
    }

}

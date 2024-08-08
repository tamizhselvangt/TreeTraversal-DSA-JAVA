public class Main {
    public static void main (String[] args) {


        Graph myGraph = new Graph();

        myGraph.addNode("John");
        myGraph.addNode("Elsa");
        myGraph.addNode("Bethovan");
        myGraph.addNode("Mark");
        myGraph.addNode("Musk");
        myGraph.addEdge("Musk" , "Elsa");
        myGraph.addEdge("Elsa" , "Mark");
        myGraph.addEdge("Elsa" , "Musk");
        myGraph.addEdge("Mark" , "Elsa");
//        myGraph.print();
        myGraph.depthFirstSearch("Elsa");
    }
}

//import java.util.*;
//public class Main {
//    public static void main(String args[]){
//
//   problem1();
//   problem2();
//
//    }
//
//    public static void problem1(){
//        System.out.println("\nProblem 1");
//        TreeNode node = new TreeNode(1);
//        node.leftChild = new TreeNode(2);
//        node.rightChild = new TreeNode(3);
//        node.leftChild.leftChild = new TreeNode(4);
//        node.leftChild.rightChild = new TreeNode(5);
//        node.leftChild.rightChild.leftChild = new TreeNode(8);
//        node.rightChild.leftChild = new TreeNode(6);
//        node.rightChild.rightChild = new TreeNode(7);
//        node.rightChild.rightChild.rightChild = new TreeNode(10);
//        node.rightChild.rightChild.leftChild = new TreeNode(9);
//        System.out.print("PreOrder : ");
//        node.preOrder(node);
//        System.out.println();
//        System.out.print("InOrder : ");
//        node.inOrder(node);
//        System.out.println();
//        System.out.print("PostOrder : ");
//        node.postOrder(node);
//    }
//
//    public static void problem2(){
//        System.out.println("\n\nProblem 2 ");
//        TreeNode node = new TreeNode(4);
//        node.leftChild = new TreeNode(2);
//        node.rightChild = new TreeNode(5);
//        node.leftChild.leftChild = new TreeNode(3);
//        node.leftChild.leftChild.rightChild = new TreeNode(9);
//        node.leftChild.leftChild.rightChild.leftChild = new TreeNode(1);
//        node.rightChild.leftChild = new TreeNode(7);
//        node.rightChild.rightChild = new TreeNode(6);
//        node.rightChild.rightChild.leftChild = new TreeNode(8);
//
//        System.out.print("PreOrder : ");
//        node.preOrder(node);
//        System.out.println();
//        System.out.print("InOrder : ");
//        node.inOrder(node);
//        System.out.println();
//        System.out.print("PostOrder : ");
//        node.postOrder(node);
//    }
//
//}

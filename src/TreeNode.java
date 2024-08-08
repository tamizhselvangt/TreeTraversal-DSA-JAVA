import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int value;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(){

    }

    public TreeNode (int value) {
        this.value = value;
    }

   public void preOrder(TreeNode node){
        if(node==null)
            return;
       System.out.print(node.value+ " ");
       preOrder(node.leftChild);
       preOrder(node.rightChild);
   }

    public void inOrder(TreeNode node){
        if(node==null)
            return;

        inOrder(node.leftChild);
        System.out.print(node.value + " ");
        inOrder(node.rightChild);
    }

    public void postOrder(TreeNode node){
        if(node==null)
            return;

        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.value + " ");
    }
}


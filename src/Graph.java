import javax.xml.transform.Source;
import java.util.*;

public class Graph {


   private class Node{
       private String lable;
       public Node(String lable){
           this.lable = lable;
       }
       @Override
       public String toString () {
           return  lable;
       }
   }

  private HashMap<String,Node> nodes = new HashMap<>();
  private HashMap<Node, List<Node>> adjacencyList = new HashMap<>();

   public void addNode(String lable){

       var node = new Node(lable);
       nodes.putIfAbsent(lable ,node);
       adjacencyList.putIfAbsent(node, new ArrayList<>());
   }

   public void addEdge(String from, String to){
       var fromNode = nodes.get(from);
       if(fromNode == null)
           throw new IllegalStateException();

       var toNode = nodes.get(to);
       if(toNode == null)
           throw new IllegalStateException();

       adjacencyList.get(fromNode).add(toNode);

   }

   public void print(){
        for(var source : adjacencyList.keySet()){
            var targets = adjacencyList.get(source);
            if(!targets.isEmpty()){
                System.out.println(source+" is connected to "+targets);
            }
        }
    }

   public void removeNode(String lable){
       var node = nodes.get(lable);

       if(node == null)
           return;

       for(var n : adjacencyList.keySet())
           adjacencyList.get(n).remove(node);

       nodes.remove(node);
       adjacencyList.remove(node);
   }

   public void removeEdge(String from, String to){

       var fromNode = nodes.get(from);
       var toNode = nodes.get(to);
       
       if(fromNode ==null || toNode == null)
           return;

       adjacencyList.get(fromNode).remove(toNode);

   }


   public void depthFirstSearch(String lable){

       depthFirstSearch(nodes.get(lable),new HashSet<>());


   }

   private void depthFirstSearch(Node root, Set<Node> visited){


       visited.add(root);
       System.out.print(root.lable+ " ");

      for(Node node : adjacencyList.get(root)){
        if(!visited.contains(node))
          depthFirstSearch(node , visited);
      }




   }





}

package quiz;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Quiz28 {
   
   static StringBuilder sb;
   
   static String[] sArr;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int T = Integer.parseInt(sc.nextLine());

      Node[] nodeArr = new Node[T+1];
      
      sb = new StringBuilder(T);
      
      sArr = sc.nextLine().split(" ");
      Arrays.fill(nodeArr, new Node(""));
      
      Node root = new Node(sArr[0]);
      
      nodeArr[0] = root;
      nodeArr[1] = root.lt = new Node(sArr[1]);
      nodeArr[2] = root.rt = new Node(sArr[2]);
      
      int idx= 3;
      
      for(int i=0; i<T-1; i++) {

         sArr = sc.nextLine().split(" ");
         System.out.println(sArr[0]);
         
         if(Stream.of(nodeArr).filter(x -> sArr[0].equals(x.data)).count()==0) {
            nodeArr[idx++] = new Node(sArr[0]);
         }
         
         Optional<Node> rootNode = Stream.of(nodeArr)
               .filter(x -> sArr[0].equals(x.data))
               .reduce((a, b) -> a);
         
         if(!".".equals(sArr[1])) 
            rootNode.get().lt = new Node(sArr[1]);
         
         if(!".".equals(sArr[2])) {
            rootNode.get().rt = new Node(sArr[2]);
            
         }
         
      }
      
      
      preOrder(root);
      System.out.println(sb.toString());

      sb.setLength(0);
      inOrder(root);
      System.out.println(sb.toString());
      
      
      sb.setLength(0);
      postOrder(root);
      System.out.println(sb.toString());
      
   }
   
   static class Node{
      String data;
      Node lt, rt;
      
      Node(String data) {
         this.data = data;
      }
      
   }
   
   
   
   static void preOrder(Node root) {
      if(root == null) {
         return;
      }
      sb.append(root.data);
      preOrder(root.lt);
      preOrder(root.rt);
      
   }
   
   static void inOrder(Node root) {
      if(root == null) {
         return;
      }
      
      inOrder(root.lt);
      sb.append(root.data);
      inOrder(root.rt);
      
   }
   
   static void postOrder(Node root) {
      if(root == null) {
         return;
      }
      
      postOrder(root.lt);
      postOrder(root.rt);
      sb.append(root.data);
   }
   
   
}
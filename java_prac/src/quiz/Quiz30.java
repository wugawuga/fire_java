package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz30 {

   static Node[] arr;
   
   static int count = 0;
   
   static int exclude;
   
   public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      
      arr = new Node[N];
      
      int[] iArr = new int[N];
      
      for(int i=0; i<N; i++) {
         arr[i] = new Node(i);
         iArr[i] = sc.nextInt();
      }
      
      exclude = sc.nextInt();

      if(exclude == 0) {
         System.out.println(0);
         return;
      }
      
      for(int i=0; i<N; i++) {
         arr[i] = new Node(i);
      }
      
      for(int i=0; i<N; i++) {
         int k = iArr[i];
         
         if(i==exclude) continue;
         
         if(k!=-1) {
            arr[k].child.add(arr[i]);
         }
      }
      
      DFS(arr[0]);
      System.out.println(count);
      
   }
  
   static class Node {
      int data;
      List<Node> child = new ArrayList<>();
      
      Node(int data) {
         this.data = data;
      }
   }
   
   static void DFS(Node root) {
      
      if(root.child.size()==0) {
         count++;
         return;
      }

      int size = root.child.size();
      
      for(int i=0; i<size; i++) {
         DFS(root.child.get(i));
      }
      

   }
   
}
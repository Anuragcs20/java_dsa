package com.tutorialspoint.datastructure;

public class QueueDemo {
   public static void main(String[] args){
      Queue queue = new Queue(6);
      
     
      queue.insert(3);
      queue.insert(5);
      queue.insert(9);
      queue.insert(1);
      queue.insert(12);


      queue.insert(15);

      if(queue.isFull()){
         System.out.println("Queue is full!");   
      }


      
      int num = queue.remove();
      System.out.println("Element removed: "+num);
      
      
      queue.insert(16);

    

      queue.insert(17);
      queue.insert(18);

      System.out.println("Element at front: "+queue.peek());

      System.out.println("----------------------");
      System.out.println("index : 5 4 3 2  1  0");
      System.out.println("----------------------");
      System.out.print("Queue:  ");
      while(!queue.isEmpty()){
         int n = queue.remove();            
         System.out.print(n +" ");
      }
   }
}

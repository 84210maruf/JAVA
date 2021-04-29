
package josepusproblem;

import java.util.Scanner;



public class JosepusProblem {

   
    public static void main(String[] args) {
          
           Scanner scan = new Scanner(System.in);
           
           System.out.println("Enter the number of bots :");
           
           int bots = scan.nextInt();
           // initialize Node
           Node head = null;
           Node currentNode = null;
           
           // Lets create a serculer singley link list
           System.out.println("Enter the bot IDs : ");
           for(int i=0; i<bots; ++i){
               
               int botId = i+1;
               Node node = new Node(botId);
               if(i==0){
                   head = node;
               }else{
                   currentNode.next = node;
               }
               currentNode = node;
           }
           
           currentNode.next = head;
           Node lastNode = lastNode(head);
           
           if(lastNode == null){
               System.out.println("Null");
           }else{
               System.out.println("JOSEPHUS ID : "+lastNode.botId);
           }
    }
    //  Method for lastNode(autometed)
    private static Node lastNode(Node head) {
       if(head == null){
           return null;
       }else if(head.next == head || head.next.next == head){
           return head;
       }else{
           while(head.next != head){
                head.next = head.next.next;
                head = head.next;   
           }
       }
       return head;
    }

  
}

class Node{
    
    int botId;
    //  next is Node class type variable 
    Node next;
    //  Constractor
    public Node(int botId){
        this.botId = botId;
        this.next = null;
    }
    
}

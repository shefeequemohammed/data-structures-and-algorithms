/*-----------------SINGLY LINKED LIST-----------------------------------------------
Author: Shefeeque Mohammed
Date: 05/01/2019
------------------------------------------------------------------*/

public class LinkedList{
    private static Node head;
    private static int numOfNodes = 0;
    
    public LinkedList(String data){
        head = new Node(data);
    }
    
    public static void main(String args[]){
        
        LinkedList l1 = new LinkedList("Node1");
        l1.addNodeToHead("Node2");
        l1.addNodeToHead("Node3");
        l1.printList();
        System.out.println("========================");
        l1.addNodeToTail("NodeLast");
        l1.printList();
        System.out.println("========================");
        l1.addToIndex(2,"AddToIndex");
        l1.printList();
        System.out.println("========================");
        l1.deleteFromIndex(1);
        l1.printList();
        System.out.println("========================");
    }
    
    public void addNodeToHead(String data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numOfNodes+=1;
    }
    
    public void addNodeToTail(String data){
        Node  temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        numOfNodes+=1;
        
    }
    
    public void addToIndex(int index, String data){
        Node  temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = new Node(data);
        temp.next.next = temp2;
        numOfNodes+=1;
        }
        
    public void deleteFromIndex(int index){
        Node  temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numOfNodes-=1;
        }
    
    
    public static void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

class Node{
    //No getters and setters to keep it simple.
    public String data;
    public Node next;
    
    public Node(String data){
        this.data = data;
    }
    
}


/* ++++++++++++++++++ OUTPUT +++++++++++++++++++++++++++++++++++++
Node3
Node2
Node1
========================
Node3
Node2
Node1
NodeLast
========================
Node3
Node2
AddToIndex
Node1
NodeLast
========================
Node3
AddToIndex
Node1
NodeLast
========================
*/


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
        
    }
    
    public void addNodeToHead(String data){
        Node temp = head;
        head = new Node(data);
        head.setNext(temp);
        numOfNodes+=1;
    }
    
    public static void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}


class Node{
    private String data;
    private Node next;
    
    public Node(String data){
        this.data = data;
    }
    
    public void setData(String data){
        this.data = data;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    public String getData(){
        return this.data;
    }
     public Node getNext(){
        return this.next;
    } 
}

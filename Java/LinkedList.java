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
        head.next = temp;
        numOfNodes+=1;
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
	//No getters & setters to make it simple
    public String data;
    public Node next;
    
    public Node(String data){
        this.data = data;
    }
    
    
}

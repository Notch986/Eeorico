package ejercicio_5;
import java.util.* ;
import ejercicio_5.Item;
import ejercicio_5.Node;
 
public class PriorityQueueList implements Queue {
	Node head,rear; 	
	int size;

	public PriorityQueue2test() {    	
    	head=null;
    	rear=null;
    	size=0;
    }

public Item peek()
{	
    return head.getNodeData();    
}

public Item pop()
{
    Node temp = head;
	head = head.prev;
	size--;
    return temp.getNodeData();
}
public void push(Item newPush) {
	 Node newNode = new Node(newPush);
     Node previous = null;
     Node current = head;

     while (current != null && newPush.getPriority() < current.getNodeData().getPriority()) {
         previous = current;
         current = current.next;
     }

     if (previous == null) {
         newNode.next = head;
         head = newNode;
     }

     else {
         previous.next = newNode;
         newNode.next = current;
     }
	size++;
	
}

public boolean isEmpty()
{
    return (size==0);
}

@Override    
public String toString()
{
	
	Node temp=head;
	String str="[Data: ";
	if(size==0) {
		str+= "NO DATA]";
	}
	else {    
	for (int i=0;i<size;i++) {
		if(i<size-1) {
    	str+=temp.getNodeData().getItemData()+", ";
    	temp=temp.getNext();
    	//System.out.println(i+","+str);
    	//System.out.println("(toString)data: "+temp.getNodeData().getItemData());
		}
		else {			
			str+=temp.getNodeData().getItemData()+"]";
			System.out.println(i+","+str);
		}			
	}
	}
    return str;
}

public class Node{
	  Item data; 
	  Node next;
	  Node prev;
	  
	  public Node (Item val) {
		   data = val; 
		   next = null; 
		   prev = null;
		  } 
	  
	  public void setNodeData (Item val) {
		   data = val; 
		  } 
		  
	  public Item getNodeData () {
		   return data;
		  } 
	  
	  public void setNext (Node n) {
		   next = n; 
		  } 
	  public Node getNext () {
		   return next;
		  }
	  public void setPrev (Node n) {
		   prev = n; 
		  } 
	  public Node getPrev () {
		   return prev;
		  }  
	 }
public static void main(String args[])
{
   	PriorityQueue2test Prio=new PriorityQueue2test();	
   	Item item1=new Item(1,1);
   	Item item2=new Item(2,9);
   	Item item3=new Item(3,2);
   	Item item4=new Item(4,5);
   	Item item5=new Item(5,10);
   	Prio.push(item1);
   	System.out.println(Prio.toString());  
   	Prio.push(item2);   	
    System.out.println(Prio.toString());
    Prio.push(item3);
   	System.out.println(Prio.toString());
   	Prio.push(item4);
   	System.out.println(Prio.toString());
   	Prio.push(item5);
   	System.out.println(Prio.toString());
   	
    
    //System.out.println("Popping head: "+Prio.pop().getItemData());
   //System.out.println(Prio.toString());
}

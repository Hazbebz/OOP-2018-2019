// Sorted linked list with a sentinel node
// Skeleton code
import java.util.Scanner;

class SortedLL
{
    // internal data structure and
    // constructor code to be added here
    class Node {
        public int data;
        public Node next;
    }
    private Node head, z;
    
    public SortedLL ()
    {
        z = new Node();
        z.next = z;
        head = z;
    }
    
    
    // this is the crucial method
    public void insert(int x)
    {
        Node prev, curr, t;
        t = new Node();
        t.data = x;
        
        z.data = x; prev = null; curr = head;
        while(curr.data < x) {
            prev = curr;
            curr = curr.next;
        }
        t.next = curr;
        
        if(prev == null) 
            head = t;
        else
            prev.next = t;           
             
    }    
    
  	public int count(int x){
  		int c = 0;
  		

  		return c;
  	}


  	public int removeDuplicates() {
  		
  		int c = 0;

  		

  		return c;
  	}

    
    public void display()
    {
        Node t = head;
        System.out.print("\nHead -> ");
        while( t != z) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("Z\n");
    }
    

    public static void main(String args[])   
    {
        SortedLL list = new SortedLL();
        list.display();
        
        double x;
        int r, i;
                
        for(i = 1; i <= 15; ++i)  {
           x =  (Math.random()*10.0);
           r = (int) x; 
           System.out.println("Inserting " + r);
           list.insert(r);
           list.display();            
        }
        
        i = 5;
        r = list.count(i);
        System.out.println("Number of " + i + "s is " + r);


        r = list.removeDuplicates();
        System.out.println("Number of removals = " + r);
        list.display();

    }
}
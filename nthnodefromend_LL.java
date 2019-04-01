import java.util.*;
public class nthnodefromend_LL {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void push(int p)
    {
        Node newnode = new Node(p);
        if ( head == null)
        {
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp=temp.next;
        }
        temp.next = newnode;
    }
    public void find( int val)
    {
        int count = 1;
        Node temp = head;
        Node temp1 = head;
        Node current = head;
        while( (current.next !=  null) && (count<= val) )
        {
            current=current.next;
            temp = temp.next;
            count++;
        }
        while(current.next != null)
        {
            temp = temp.next;
            temp1 = temp1.next;
            current=current.next;
        }
        System.out.println("Next value is " + temp1.data);

    }
    public void print()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        nthnodefromend_LL ob = new nthnodefromend_LL();
        for(int i=1;i<=10;i++)
        {
            ob.push(i);
        }
        Scanner sc = new Scanner(System.in);
        ob.print();
        System.out.println("Enter the nth node from the end of the LL");
        int p = sc.nextInt();
        ob.find(p);
        //ob.print();

    }
}


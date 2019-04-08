
import java.util.Scanner;

public class reverseLLblocks {
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
    public void push(int d)
    {
        Node newnode = new Node(d);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void print()
    {
        Node temp=head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node reversepairblocks(int k, Node first)
    {
        Node current=first;
        Node prev=null;
        Node next1=null;
        int count=0;
        while(count < k && current != null)
        {
            next1=current.next;
            current.next=prev;
            prev=current;
            current=next1;
            count++;
        }
        if(next1 != null)
            first.next=reversepairblocks(k,next1);
        return prev;
    }
    public static void main(String args[])
    {

        reverseLLblocks ob = new reverseLLblocks();
        for(int i=0;i<8;i++)
        {
            ob.push(i);
        }
        ob.print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the block");
        int val=sc.nextInt();
        ob.head=ob.reversepairblocks(val,ob.head);
        ob.print();
    }
}


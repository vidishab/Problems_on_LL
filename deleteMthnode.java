
import java.util.Scanner;

public class deleteMthnode {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=this;
        }
    }
    public void push(int d)
    {
        Node newnode=new Node(d);
        Node temp=head;
        if(head== null)
        {
            head=newnode;
            return;
        }
        while(temp.next != head)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
    }
    public void print()
    {
        Node temp=head;
        do
        {
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp != head);
    }
    public void mthnode(int len,int M)
    {
        Node temp=head;
        for(int count=len ; count > 1; count--)
        {
            for(int i=0;i< M-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        System.out.println("Node : " + temp.data );
    }
    public static void main(String args[])
    {
        deleteMthnode ob = new deleteMthnode();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the LL");
        int len=sc.nextInt();
        System.out.println("Enter the node to be deleted");
        int len1=sc.nextInt();
        for(int i=0;i<len;i++)
        {
            ob.push(i);
        }
        ob.print();
        ob.mthnode(len,len1);
    }
}


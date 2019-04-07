
public class middelofLL {
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
        Node temp = head;
        if(head == null)
        {
            head=newnode;
            return;
        }
        while(temp.next != null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void findmiddle()
    {
        int i1=0;
        Node temp = head;
        Node temp1=head;
        while(temp1 != null && temp1.next != null)
        {
            temp=temp.next;
            temp1=temp1.next.next;
        }
        System.out.println(temp.data);
    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        middelofLL ob = new middelofLL();
        for(int i=1;i<=5;i++)
            ob.push(i);
        ob.print();
        ob.findmiddle();

    }
}


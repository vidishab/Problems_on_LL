public class NULLorLoop {
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
        Node temp=head;
     Node newnode = new Node(d);
     if(head == null)
     {
         head=newnode;
         return;
     }
     do
     {
         temp=temp.next;
     }
     while(temp.next != head);

     temp.next=newnode;
     newnode.next=head;
     head=newnode;
    }

    public void find()
    {
        Node fastptr=head;
        Node slowptr=head;
        Node temp = head;
        while( temp.next != head ) //&& fastptr.next != head && slowptr.next != head)
        {
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if( fastptr == slowptr )
            {
                System.out.println("Cycle found");
                return;
            }
        }
        System.out.println("Not found");
    }
    public void print()
    {
        Node current = head;
        while(current.next != head)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String args[])
    {
        NULLorLoop ob = new NULLorLoop();
        for ( int i=1;i<=10;i++)
        {
            ob.push(i);
        }
        ob.print();
        ob.find();
    }
}


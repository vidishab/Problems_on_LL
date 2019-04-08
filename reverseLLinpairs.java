
public class reverseLLinpairs {
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
        while(temp.next != null)
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
    public Node reversepairs(Node first)
    {
        //Node current=head;
        Node temp=first;
        if(first == null || first.next == null)
        {
            return first;
        }
        else {
            Node temp1 = temp.next;
            temp.next = temp1.next;
            temp1.next = temp;
            first=temp1;
            first.next.next = reversepairs(first.next.next);
            return first;
        }
    }
    public static void main(String args[])
    {
        reverseLLinpairs ob = new reverseLLinpairs();
        for(int i=0;i<10;i++)
        {
            ob.push(i);
        }
        ob.print();
        ob.head=ob.reversepairs(ob.head);
        ob.print();
    }
}


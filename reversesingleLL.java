public class reversesingleLL {
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
        if(head == null)
        {
            head=newnode;
            return;
        }
        Node current=head;
        while(current.next != null)
        {
            current=current.next;
        }
        current.next=newnode;
    }
    public void print()
    {
        Node current=head;
        while(current != null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void reverse()
    {
        Node current=head;
        Node prev=null;
        Node next=null;
        while(current != null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public Node reverse1(Node curr, Node prev)
    {
        if(curr.next==null)
        {
            head=curr;
            curr.next=prev;
            return head;
        }
        Node next1=curr.next;
        curr.next=prev;
        reverse1(next1,curr);

        return head;
    }
    public static void main(String args[])
    {
        reversesingleLL ob = new reversesingleLL();
        for(int i=1;i<=10;i+=2)
        {
            ob.push(i);
        }
        ob.reverse();
        ob.print();
        System.out.println("Recursive LL");
        ob.reverse1(ob.head,null);
        ob.print();
    }
}


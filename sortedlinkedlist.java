
public class sortedlinkedlist {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
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
        public void insertinlist(int d)
        {
            Node newnode = new Node(d);
            Node current = head;
            Node prev=head;
            while(current != null && current.data < newnode.data)
            {
                prev=current;
                current=current.next;
            }
            newnode.next=prev.next;
            prev.next=newnode;

        }
    public static void main(String args[])
    {
        sortedlinkedlist ob = new sortedlinkedlist();
        for(int i=1;i<=10;i+=2)
        {
            ob.push(i);
        }
        ob.print();
        ob.insertinlist(2);
        System.out.println("New Insertion");
        ob.print();

    }
}



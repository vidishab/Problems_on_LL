
public class mergetwosorted {
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
        Node temp = head;
        while(temp.next != null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public Node mergelist(Node first, Node second)
    {

        mergetwosorted ob2 = new mergetwosorted();
        if(first==null)
            return second;
        if(second==null)
            return first;
        while(first != null && second != null)
        {
            if(first.data < second.data)
            {
                ob2.push(first.data);
                first=first.next;
            }
            else if(second.data < first.data)
            {
                ob2.push(second.data);
                second=second.next;
            }
            else
            {
                ob2.push(first.data);
                ob2.push(second.data);
                first=first.next;
                second=second.next;
            }
        }
        if(first == null)
        {
            while (second != null)
            {
                ob2.push(second.data);
                second=second.next;
            }
        }
        if(second == null)
        {
            while (first != null)
            {
                ob2.push(first.data);
                first=first.next;
            }
        }
        return ob2.head;
    }
    public void print()
    {
        Node temp=head;
        while(temp !=  null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        mergetwosorted ob = new mergetwosorted();
        mergetwosorted ob1 = new mergetwosorted();
        mergetwosorted ob3 = new mergetwosorted();
        for(int i=1;i<=12;i+=2)
        {
            ob.push(i);
        }
        for(int i=0;i<=10;i+=2)
        {
            ob1.push(i);
        }
        ob.print();
        ob1.print();
        ob3.head=ob3.mergelist(ob.head,ob1.head);
        ob3.print();

    }
}


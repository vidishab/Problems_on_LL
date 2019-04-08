
public class eventhennodesorting {
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
        Node newnode=new Node(d);
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
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node merge()
    {
        eventhennodesorting ob1 = new eventhennodesorting();
        Node temp=head;
        Node prev=head;
        while(temp != null)
        {
            if (temp.data % 2 == 0) {
                temp = temp.next;
            }
            if (temp.data % 2 != 0) {
                prev.next = prev.next.next;
                ob1.push(temp.data);
                prev = prev.next;
            }

            temp = temp.next;

        }
        return ob1.head;
    }
    public static void main(String args[])
    {

        eventhennodesorting ob2 = new eventhennodesorting();
        eventhennodesorting ob = new eventhennodesorting();
        for(int i=2;i<10;i++)
        {
            ob.push(i);
        }
        //ob.print();
        ob2.head=ob.merge();
        ob.print();
        ob2.print();
    }
}


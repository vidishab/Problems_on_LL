
public class findintersectingnod {
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
        temp.next = newnode;
    }
    public void push1(Node temp,Node temp1)
    {

        while(temp.next != null)
        {
            temp=temp.next;
        }
        while(temp1.next != null)
        {
            temp1= temp1.next;
        }
        temp1.next=temp;
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
    public static void findintersection(Node temp1, Node temp2)
    {
        int c=0,c1=0,diff,i;
        Node ob = temp1; Node ob1 = temp2;
        while(temp1 != null)
        {
            temp1= temp1.next;
            c++;
        }
        while(temp2 != null)
        {
            temp2=temp2.next;
            c1++;
        }
        System.out.println("c:" + c);
        System.out.println("c1:" + c1);

        //System.out.println("Found");
        if(c < c1) {
            temp1 = ob;
            temp2 = ob1;
            diff = c1 - c;
        }
        else
        {
            temp1=ob; temp2=ob1; diff = c-c1;
            System.out.println(temp1.data);
        }
        for(i=0;i<diff;i++)
        {
           temp1=temp1.next;
           //System.out.println(temp1.data);
        }
        while(temp1!=null && temp2 != null)
        {
           //System.out.println(temp2.data);
            if(temp1.next == temp2.next)
            {
                System.out.println(temp1.next.data + "found");
                break;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
    }
    public static void main(String args[])
    {
        findintersectingnod ob = new findintersectingnod();
        findintersectingnod ob1 = new findintersectingnod();
        for(int i=1; i<=12;i+=2)
        {
            ob.push(i);

        }
        ob1.push(2);
        ob1.push(3);
        //ob1.push(6);
        ob1.push1(ob.head,ob1.head);
        //ob.print();
        //ob1.print();
        findintersection(ob.head,ob1.head);


    }
}


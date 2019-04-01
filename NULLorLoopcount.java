public class NULLorLoopcount {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = this;
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
            do {
                temp=temp.next;
            }while(temp.next != head);
            temp.next = newnode;
            newnode.next=head;
            head=newnode;
        }
        public void find()
        {
            Node fastptr=head;
            Node slowptr=head;
            Node temp=head;
            while(temp.next != head)
            {
                fastptr=fastptr.next.next;
                slowptr=slowptr.next;
                if(fastptr == slowptr)
                {
                    System.out.println("Cycle found");
                    slowptr=head;
                    while(slowptr != fastptr)
                    {
                        slowptr=slowptr.next;
                        fastptr=fastptr.next;
                    }
                    System.out.println(slowptr.data);
                    break;
                }
            }
        }

        public void count()
        {
            Node fastptr=head;
            Node slowptr=head;
            Node temp=head;
            while(temp.next != head)
            {
                slowptr=slowptr.next;
                fastptr=fastptr.next.next;
                if(slowptr==fastptr)
                {
                    int count = 1;
                    fastptr=fastptr.next;
                    do
                    {
                        fastptr=fastptr.next;
                        count++;
                    }while(fastptr != slowptr);
                    System.out.println("Count of nodes is" + count);
                    break;
                }
            }
        }

        public void print()
        {
            Node temp=head;
            do
            {
                System.out.println(temp.data);
                temp = temp.next;
            }while(temp != head);
        }
    public static void main(String args[])
    {
        NULLorLoopcount ob = new NULLorLoopcount();
        for(int i=1;i<=20;i++)
        {
            ob.push(i);
        }

        ob.print();
        ob.find();
        ob.count();
    }
}


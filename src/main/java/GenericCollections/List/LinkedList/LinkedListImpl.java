package GenericCollections.List.LinkedList;// in linked list

//Collections.List.LinkedList.Node class
class Node
{
    int data;
    Node previous;
    Node(int d)
    {
        data = d;
        previous = null;
    }
}

//Linked list class
class LinkedListImpl<T>
{
    Node head;    //Head of list // try another approach without this, where you use iteration to find head each time and add head.next as new node

    //Inserts a new node at the front of the list
    public void push(int new_data)
    {
        //Allocate new node and putting data
        Node new_node = new Node(new_data);

        //Make previous node of new node as current head
        new_node.previous = head;

        //Move the head to point to new Collections.List.LinkedList.Node
        head = new_node;

    }

    //Checks whether the value x is present in linked list
    public boolean search(Node head, int x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {

            if (current.data == x)
                return true;    //data found
            current = current.previous;//nested associations

        }
        return false;    //data not found
    }

    public boolean delete(Node node,int data) {
   Node current=node;
        while (current != null) {
                if (current==head && current.data==data){
                    head= head.previous;
                return true;
            }
                //deleting ele is same as changing the previous element
                else if (current.previous.data==data){
                    current.previous=current.previous.previous;
                    return true;
                }
                current=current.previous;

        }
        return false;
    }
    //Driver function to test the above functions

    public static void printLinkedListFromHead(Node head){
        Node current=head;
        while (current != null)
        {
            System.out.println(current.data);
            current=current.previous;
        }

    }
    public static void main(String args[])
    {

        //Start with the empty list
        LinkedListImpl llist = new LinkedListImpl ();

        /*Use push() to construct below list
        14->21->11->30->10  */
        llist.push(10);
        llist.push(30);
        llist.push(11);
        llist.push(21);
        llist.push(14);

        if (llist.search(llist.head, 10))
            System.out.println("Yes");
        else
            System.out.println("No");

        if(llist.delete(llist.head,21)){
            System.out.println("found and deleted");
        }
        printLinkedListFromHead(llist.head);



    }
}

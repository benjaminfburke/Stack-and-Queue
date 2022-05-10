public class Stack<Item> {
    private int n;
    private Node first;

    //constructor: creates an empty Stack
    public Stack() {
	//To be implemented
        this.first = null;

    }

    //adds item to the top of the Stack
    public void push(Item item) {
	//To be implemented
        Node old = new Node();
        old.item = item;
        old.next = first;
        first = old;
    }

    //removes and returns the top item from the Stack
    //throw EmptyStackException if the Stack is empty
    public Item pop() throws EmptyStackException {
	//To be implemented
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            Node temp = first;
            first = first.next;
            return temp.item;
        }
    }
    
    //return true if the Stack is empty, false else
    public boolean isEmpty() {
	//To be implemented
        if (first == null) {
            return true;
        }
        else {
            return false;
        }
    }

    //return the size (number of items) of the Stack
    public int size() {
	//To be implemented
        Node temp = first;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //return but do not remove the top item from the Stack
    //throw EmptyStackException if the Stack is empty
    public Item peek() throws EmptyStackException {
	//To be implemented
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            return first.item;
        }
    }


    private class Node {
	Item item;
	Node next;
    }
}
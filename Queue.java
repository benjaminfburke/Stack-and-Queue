public class Queue<Item> {
    private Item[] queue;
    private int f = 0;
    private int b = 0;
    private int size = 0;
    private int capacity;

    //constructor: create an empty Queue with initial
    //capacity of 1
    public Queue() {
	//To be implemented
        this.queue = (Item[]) new Object[1];
        this.capacity = 1;
    }

    //constructor: create an empty Queue with initial
    //capacity of n
    public Queue(int n) {
	//To be implemented
        this.queue = (Item[]) new Object[n];
        this.capacity = n;
    }
    
    //add an item to the back of the Queue
    //double the array capacity if the Queue is full
    public void enqueue(Item item) {
	//To be implemented
        //If array is full, double capacity
        int length = queue.length;
        if (size == queue.length) {
            Item[] temp = (Item[]) new Object[queue.length * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = queue[f];
                f = (f + 1) % queue.length;
            }
            //update front and back variables
            f = 0;
            b = size;
            queue = temp;
        }

        //Enqueue method and updating back index variable
        queue[b] = item;
        b = (b + 1) % queue.length;
        size++;

    }

    //remove and return the front item from the Queue
    //throw EmptyQueueException if the Queue is empty
    //reduce the array capacity by half if the size 
    //of the Queue falls below 1/4 full
    public Item dequeue() throws EmptyQueueException {
	//To be implemented
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        else {

            int length = queue.length;

            //set first node to null
            Item toDelete = queue[f];
            queue[f] = null;

            //check if need to decrease capacity
            if (size <= capacity / 4 && capacity * 2 <= size) {
                Item[] temp = (Item[]) new Object[capacity/2];
                for (int i = 0; i < queue.length; i++) {
                    temp[i] = queue[i];
                }

                queue = null;
                queue = (Item[]) new Object[capacity];

                //copy elements from old array to new array
                for (int i = 0; i < temp.length; i++) {
                    queue[i] = temp[i];
                }
            }

            //update front and back accordingly
            if (f == b) {
                f = 0;
                b = 0;
            }
            else if (f == queue.length - 1) {
                f = 0;
            }
            else {
                f = (f + 1) % queue.length;
            }

            //decrease size and return the deleted node
            size--;
            return toDelete;
        }


    }

    //return true if the Queue is empty
    //return false if the Queue is not empty
    public boolean isEmpty() {
	//To be implemented
        //check if size is 0
        if (size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    //return the size of the Queue (i.e. the 
    //number of elements currently in the Queue)
    public int size() {
	//To be implemented
        return size;
    }

    //return but do not remove the front item in the Queue
    //throw an exception if the Queue is empty
    public Item peek() throws EmptyQueueException {
	//To be implemented
        //throw exception
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        //return first element
        else {
            return queue[0];
        }
    } 
    
    //return the underlying array
    public Item[] getArray() {
	return queue;
    }
}
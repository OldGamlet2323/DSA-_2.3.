public class Circular_Queue {
    private Node front;
    private Node rear;

    public Circular_Queue(){
            front = null;
            rear = null;
    }

    public void enQueue(int data){
        Node new_Node = new Node(data);
        if(rear == null){
            rear = new_Node;
            front = rear;
        } else {
            rear.next = new_Node;
            rear = new_Node;
            rear.next = front;
        }
    }

    public int deQueue(){
        if(front == null) {
            System.err.println("Empty Queue!!");
            return -1;
        } else {
            int poppedElement = front.data;
            front = front.next;
            rear.next = front;
            return poppedElement;
        }
    }

    public int peek(){
        int element = 0;
        if(front == null) {
            System.err.println("Queue is empty!!");
        } else {
            element = front.data;
            return element;
        }
        return element;
    }
    
    public void print(){
        if(front == null) {
            System.err.println("Queue is Empty!!");
        } else {
            while(front != rear) {
                System.out.print(front.data + " ");
                front = front.next;
            }
            System.out.println(rear.data);
        }
    }
}

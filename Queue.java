public class Queue {
    private int front;
    private int rear;
    private int capacity;
    private int[] elements;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        rear = -1;
        front = -1;
    }

    public void enqueue(int new_elements){
        if(size == capacity){
            System.err.println("Queue is full");
        }
        rear++;
        elements[rear] = new_elements;
        size++;
    }
    public int dequeue(){
        if (size == 0){
            System.err.println("Queue is empty");
        }
        front++;
        int deElements = elements[front];
        size--;
        return deElements;
    }

    public int getSize() {
        return size;
    }

    public int peek(){
            if(size == 0){
                System.err.println("Queue is empty. Cannot peek");
                return -1;
            } else if(size == capacity){
                System.err.println("Queue is full. Cannot peek");
            }
            return elements[front+1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (size == 0) {
            return "Queue is empty.";
        } else {
            sb.append("Queue: ");
            for (int i = front + 1; i <= rear; i++) {
                sb.append(elements[i]);
                if (i < rear) {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }
}

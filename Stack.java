public class Stack {
    private int top;
    private int capacity;
    private int[] storage;

    public Stack(int capacity) {
        this.capacity = capacity;
        top = -1;
        storage = new int[capacity];
    }

    public boolean push(int element){
        if(isFull()){
            System.out.println("Stack overflow");
            return false;
        }
        top++;
        storage[top] = element;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.err.println("Stack underflow");
        }
        top--;
        return storage[top];
    }

    public int peek(){
        if( top < 0){
            System.err.println("Stack underflow");
            return -1;
        }
        return storage[top];
    }

    public int size(){
        return top + 1;
    }

    public boolean isFull(){
        if( top == storage.length - 1){
            System.err.println("This stack is full");
        }
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        if(top == -1){
            System.err.println("Stack is empty");
        }
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        if(!isEmpty()){
            sb.append("Top: ");
            for(int i = top; i >= 0 ; i--){
                sb.append(storage[i]);
                if(i > 0){
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }
}

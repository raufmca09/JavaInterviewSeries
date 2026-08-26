public class StackCreation {

    int size;
    int top;
    int arr[];

    StackCreation(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return ( top == -1);
    }

    public boolean isFull(){
        return ( size-1 == top);
    }

    public int peek(){
        if(!this.isEmpty()){
            return arr[top];
        }else{
            System.out.println("Stack is empty !!");
            return -1;
        }
    }

    public void push(int element){
        if(!isFull()){
            top++;
            arr[top] = element;
            System.out.println("Element pushed " + element);
        }else{
            System.out.println("Stack is full now");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int popup = arr[top];
            top--;
            return popup;
        } else {
            System.out.println( "Stack is empty ");
            return -1;
        }
    }

    public static void main(String args[]){

        StackCreation stack = new StackCreation(5);
        System.out.println(stack.pop());

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println(stack.pop());

        

    }
}

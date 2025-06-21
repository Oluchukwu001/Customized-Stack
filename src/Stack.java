public class Stack {
    private int[]stack;
    private final int defaultnumber=10;
    int pointer=-1;
    public Stack(){
        this.stack=new int[defaultnumber];
    }
    public Stack(int size){
        this.stack=new int[size];
    }
    public boolean isFull(){
        return pointer == stack.length - 1;
    }
    public boolean push(int value) throws StackOverflowException {

        if(!isFull()){
            pointer++;
            stack[pointer]= value;
            return true;
        }
            throw new  StackOverflowException("Can not add to already full stack");

    }

    public int pop() throws StackOverflowException{
        if(!isEmpty()){
            return stack[pointer--];
        }
        throw new StackOverflowException("Cannot pop from empty stack");
    }
    public boolean isEmpty(){
        return pointer==-1;
    }

    public int peek(){
        if(!isEmpty()){
            return stack[pointer];
        }
        System.out.println("Stack is empty");
        return -1;
    }
}

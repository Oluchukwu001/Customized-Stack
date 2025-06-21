
public class Main {
    public static void main(String[] args) throws StackOverflowException {
        Stack stack= new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(4);
        stack.push(3);
        stack.push(45);
        stack.push(30);
        stack.push(30);
        stack.push(30);
        stack.push(30);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
package work;

public class Test03 {
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin());

        stack.pop();
        stack.top();

        System.out.println(stack.getMin());
    }

}

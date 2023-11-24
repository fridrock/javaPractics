package practic20_new;

public class TestStack {
    public static void main(String[] args) {
        var stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peek());
        stack.display();
        System.out.println(stack.peek(3));
        System.out.println(stack.count());
        stack.change(10.0, 2);
        stack.display();
    }
}

package practic16_new;

public class First {
    public static void main(String[] args) {
        var test = new First();
        test.exceptionDemo();
    }
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }
}
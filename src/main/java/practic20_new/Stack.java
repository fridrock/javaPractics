package practic20_new;

public class Stack {
    private int size;
    private int currentPosition;
    private Double[] numbers;
    public Stack(int size){
        this.currentPosition = 0;
        this.size = size;
        this.numbers = new Double[this.size];
    }
    public boolean isEmpty(){
        return currentPosition==0;
    }
    public boolean isFull(){
        return currentPosition==size;
    }
    public double peek(){
        return numbers[currentPosition-1];
    }
    public double peek(int position){
        return numbers[currentPosition-position];
    }
    public int count(){
        return currentPosition;
    }
    public void change(Double newNumber, int position){
        numbers[currentPosition-position] = newNumber;
    }
    public void display(){
        int index = 1;
        for(int i = currentPosition-1;i>=0;i--){
            System.out.println(index+":"+numbers[i]);
            index++;
        }
    }
    public double pop(){
        currentPosition--;
        double result = numbers[currentPosition];
        numbers[currentPosition] = null;
        return result;
    }
    public void push(double number){
        if (!isFull()) {
            System.out.println("Добавляем в стек число: "+number);
            this.numbers[currentPosition] = number;
            this.currentPosition++;
        }else{
            System.out.println("Вставка невозможна, стек переполнен");
        }
    }
}

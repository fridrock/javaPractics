package practic18_new;

import java.io.Serializable;

public class Generics<T extends Comparable,V extends Animal & Serializable,K>{
    private T first;
    private V second;
    private K third;

    public Generics(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public T getFirst() {
        return first;
    }
    public V getSecond() {
        return second;
    }
    public K getThird() {
        return third;
    }
    public void printNames(){
        System.out.println("Classname first:" + this.first.getClass().getName());
        System.out.println("Classname second:" + this.second.getClass().getName());
        System.out.println("Classname third:" + this.third.getClass().getName());
    }

}

package practic14_new;


import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T> {
    protected ConcurrentLinkedQueue<T> collection;
    public WaitList(){
        collection = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<T> collection){
        this.collection = new ConcurrentLinkedQueue<>(collection);
    }
    @Override
    public void add(T element) {
        collection.add(element);
    }
    @Override
    public T remove() {
        return collection.remove();
    }
    @Override
    public boolean contains(T element) {
        return collection.contains(element);
    }
    @Override
    public boolean containsAll(Collection<T> collection) {
        return this.collection.containsAll(collection);
    }
    @Override
    public boolean isEmpty() {
        return collection.isEmpty();
    }
    @Override
    public String toString() {
        return "WaitList: " + collection;
    }
}
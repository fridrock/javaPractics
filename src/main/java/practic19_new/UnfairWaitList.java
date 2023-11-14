package practic19_new;

public class UnfairWaitList<T> extends WaitList<T> {
    public void remove(T element)
    {
        System.out.println(collection.peek());
        if (!element.equals(collection.peek())) {
            collection.remove(element);
        }
    }
    public void moveToBack() {
        collection.add(collection.remove());
    }
    @Override
    public String toString() {
        return "UnfairWaitList { collection = " + collection + " }";
    }
}

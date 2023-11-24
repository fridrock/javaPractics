package practic14_new;

import practic14_new.WaitList;

public class UnfairWaitList<T> extends WaitList<T> {
    public void remove(T element)
    {
        if (!element.equals(collection.peek())) {
            collection.remove(element);
        }
    }
    public void moveToBack() {
        collection.add(collection.remove());
    }
    @Override
    public String toString() {
        return "UnfairWaitList : " + collection;
    }
}

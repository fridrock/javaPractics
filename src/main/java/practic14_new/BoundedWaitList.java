package practic14_new;

import practic14_new.WaitList;

public class BoundedWaitList<T> extends WaitList<T> {
    private final int capacity;

    public BoundedWaitList (int capacity)
    {
        super();
        this.capacity = capacity;
    }

    @Override
    public void add(T element)
    {
        if (collection.size() + 1 <= capacity)
        {
            collection.add(element);
        }
    }

    @Override
    public String toString()
    {
        return "BoundedWaitList: capacity = " + capacity + ", {" + collection + " }";
    }
}

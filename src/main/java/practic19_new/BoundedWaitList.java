package practic19_new;

public class BoundedWaitList<T> extends WaitList<T> {
    private final int capacity;

    public BoundedWaitList (int capacity)
    {
        this.capacity = capacity;
    }
    public int getCapacity()
    {
        return capacity;
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
        return "BoundedWaitList { " + "capacity = " + capacity + ", collection = " + collection + " }";
    }
}

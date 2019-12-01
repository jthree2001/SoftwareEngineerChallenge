package java.main;

/*
    Declare the class as final so it can’t be extended.
    Make all fields private so that direct access is not allowed.
    Don’t provide setter methods for variables
    Make all mutable fields final so that it’s value can be assigned only once.
    Initialize all the fields via a constructor performing deep copy.
    Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
*/

public interface Queue[T]
{
    public Queue<T> enQueue(T t);
    // Removes the element at the beginning of the immutable queue, and returns the new queue.
    public Queue<T> deQueue();
    public T head();
    public boolean isEmpty();
}

public final class T 
{
    public static void main()
    {
        //  Do stuff here I guess
    }
}

public final class Queue<T> implements Queue<T>
{
    private T liveQueue[];
    public Queue<T> enQueue(T t)
    {
        liveQueue.push(t);
        return liveQueue.clone();
    }

    public Queue<T> deQueue()
    {
        liveQueue.pop();
        return liveQueue.clone();
    }

    public T head()
    {

    }

    public boolean isEmpty()
    {
        return liveQueue.isEmpty();
    }
}
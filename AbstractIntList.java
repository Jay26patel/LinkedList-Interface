

public abstract class AbstractIntList<T> implements IntList<T>{

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public void add(T value) {
        add(size(), value);
    }

    public boolean contains(T value)
    {
        return indexOf(value) >=0 ;
    }
}

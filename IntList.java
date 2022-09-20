import java.util.Iterator;

public interface IntList<T> extends Iterable<T> {
    public void add(T value);
    public void add(int index, T value);
    public T get(int index);
    public int indexOf(T value);
    public Iterator iterator();
    public boolean isEmpty();
    public void remove(int index);
    public int size();
    public boolean contains(T value);
}



import java.util.NoSuchElementException;

public class LinkedList {

    private Node front, previous;
    private int size;


    public LinkedList() {
        front = null;
        size = 0;
    }


    public void add(int value) {

        if (size == 0) {
            front = new Node(value);
            front.previous = null;  //Set previous node of first node to null
        } else {
            Node current = front;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            Node newNode;
            current.nextNode = new Node(value);
            previous = current.previous;
        }
        size++;
    }


    public void add(int index, int value) {
        if (index == 0) front = new Node(value, front, null);
        else {
            Node current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.nextNode;
            }
            Node newNode;
            current.nextNode = new Node(value, current.nextNode, current.previous);
            //previous = current.previous;
        }
        size++;
    }


    public int size() {
        return size;
    }


    public int get(int index) {
        if (size == 0 || index >= size || index < 0) throw new IndexOutOfBoundsException();

        Node current = front;
        for (int i = 0; i < index; i++) {
            current = current.nextNode;
        }
        return current.data;
    }


    public int remove() {
        if (size == 0) throw new NoSuchElementException();
        int ret = front.data;
        front = front.nextNode;
        size--;
        return ret;
    }


    public void remove(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        else {
            Node current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.nextNode;
            }

            current.nextNode = current.nextNode.nextNode;
            previous = current;
        }
        size--;
    }


    public String toString() {
        String s = "[";
        Node current = front;
        while (current != null) {
            s += current.data;
            if (current.nextNode != null) s += ", ";
            current = current.nextNode;
        }
        s += "]";
        return s;
    }


    public void removeRange(int start, int end){

        if(start < 0 || end < 0)
            throw new IllegalArgumentException();
        else
        {
            int index = 1;
            Node current = front;
            Node first= front;
            Node last= null;

            while(current != null){
                if( index == start)
                    first= current;

                else if(index -1 == end)
                    last = current;

                current = current.nextNode;
                index++;
            }

            if(start == 0)
                front = last.nextNode;
            else
                first.nextNode = last.nextNode;
        }

    }

}










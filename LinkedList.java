import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList <T> extends AbstractIntList<T> {

    private Node front;
    private int size;

    public LinkedList(){

        front = null;
        size = 0;
    }

    public void add(T value) {

        if(size == 0) {
            front = new Node(value);
        }
        else {
            Node current = front;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = new Node(value);
        }
        size++;
    }


    public void add(int index, T value) {

        if(index == 0)
            front = new Node(value);
        else {
            Node curr = front;
            int i =0;
            while (i<index && curr.nextNode != null) {
                curr = curr.nextNode;
                i++;
            }
            curr.nextNode = new Node(value);
        }
        size++;
    }


    public T get(int index){

        if(size==0 || index >= size || index < 0) throw new IndexOutOfBoundsException();
        Node current = front;
        for (int i = 0; i < index; i++) {
            current = current.nextNode;
        }
        return current.data;
    }


    public T remove() {

        if(size == 0) throw new NoSuchElementException();
        T ret = front.data;
        front = front.nextNode;
        size--;
        return ret;
    }


    public void remove(int index) {

        if(index >= size || index < 0) throw new IndexOutOfBoundsException();
        else {
            Node current = front;
            for(int i = 0; i< index-1; i++) {
                current = current.nextNode;
            }
        } size--;
    }


    public int indexOf(T value) {

        if(front ==null && size==0 )
            return -1;
        else {
            Node curr = front;
            int i = 0;
            while(curr != null) {
                if((curr.data == value))
                    return i;
                curr = curr.nextNode;
                i++;
            }
            return i;
        }
    }


    public String toString() {
        String s = "[";
        Node current = front;
        while (current != null) {
            s += current.data;
            if(current.nextNode != null) s += ", ";
            current = current.nextNode;
        }
        s += "]";
        return s;
    }


    public int size(){
        return size;
    }


    public boolean isEmpty(){
        return front == null;
    }


    public int min(){
        int min;
        if(size == 0) throw new NoSuchElementException();       //throws an exception if the size is empty.
        else {
            Node current = front.nextNode;
             min = (int) front.data;                            //Cast type T(front.data) into int to compare it with different element.

            while(current != null){
                int i = (int) current.data;

                if(i < min)
                    min =(int) current.data;
                current = current.nextNode;
            }
        }
        return min;
    }


    public LinkedList<Integer> compress () {

        Node current = front;
        LinkedList<Integer> compress = new LinkedList<>();
        int sum;

            while (current.nextNode != null) {
                sum = (int) current.data + (int) current.nextNode.data;     // add the current element and next element.
                compress.add(sum);

                if (size % 2 == 0) {                                   // If the size of the list is even.
                    if (current.nextNode.nextNode != null)                  //If we have some more elements left in list.
                        current = current.nextNode.nextNode;
                    else break;                                             //If we don't have any element left in list.
                }

                else{                                                       // If the size of the list is odd
                    if (current.nextNode.nextNode.nextNode != null)          //If we have two more elements left in list.
                        current = current.nextNode.nextNode;
                    else {
                        compress.add((int) current.nextNode.nextNode.data);        // leave the last element in list.
                        break;
                    }
                }
        }
        return compress;
    }


//Check whether list is sorted or not.
    public boolean isSorted() {
        if(front == null)
            return true;
        Node current = front;
        while (current.nextNode != null){
            if((int)current.data > (int)current.nextNode.data)
                return false;
                current =  current.nextNode;
        }
        return true;
    }


// Return last index
    public int lastIndexOf(int value) {
        int lastIndex = -1;
        int index = 0;
        Node current = front;
        while(current!=null) {
            if((int)current.data == value)
                lastIndex = index;
            index++;
            current = current.nextNode;
        }
        return lastIndex;
    }


//Counts the number of duplicates.
    public int countDuplicates() {
        if(front == null)
            return 0;
        int duplicates = 0;

        Node current = front;
        while(current.nextNode != null) {
            if(current.data == current.nextNode.data) {
                duplicates++;
            }
            current = current.nextNode;
        }
        return duplicates;
    }


// To check if list has two Consecutive.
    public boolean hasTwoConsecutive(){
        if(front == null)
            return false;

        Node current = front;
        while(current.nextNode != null) {
            if((int)current.data == (int)current.nextNode.data - 1)
                return true;

            current = current.nextNode;
        }
        return false;
    }


//Delete the last number.
    public int deleteBack() {
        if(front == null)
            throw new NoSuchElementException();

        int data;

        if(front.nextNode == null) {
            data = (int)front.data;
            front = null;
            return data;
        }

        Node n = front;

        while(n.nextNode.nextNode != null)
            n = n.nextNode;

        data = (int)n.nextNode.data;
        n.nextNode = null;
        return data;
    }


    public void switchPairs() {
        Node current = front;

        while (current != null && current.nextNode != null) {
            T temp =  current.data;
            current.data = current.nextNode.data;
             current.nextNode.data = temp;
            current = current.nextNode.nextNode;
        }
    }


    public void stutter() {
        Node current = front;

        while(current != null){
            current.nextNode = new Node(current.data, current.nextNode);
            current = current.nextNode.nextNode;
        }
    }


    public void stretch(int value) {
        Node current = front;

        while (current != null) {
            for (int i = 1; i < value; i++) {
                current.nextNode = new Node(current.data, current.nextNode);
                current = current.nextNode;
            }
            current = current.nextNode;
        }
    }



    public Iterator<T> iterator() {
        return new LinkedIterator();
    }


    private class LinkedIterator implements Iterator<T> {

        private Node current;
        public LinkedIterator(){
            current = front;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next(){
            T result = current.data;
            current = current.nextNode;
            return result;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
    }


    private class Node {

        Node nextNode;
        T data;

        public Node(T value) {
            this.data = value;
            this.nextNode = null;
        }

        public Node(T value, Node nextNode){
            this.data = value;
            this.nextNode = nextNode;
        }
    }
}




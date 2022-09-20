public class ClientCode {
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println("List content: " + linkedList);
        System.out.println("size: " + linkedList.size());

        linkedList.add(1,10);
        System.out.println("List content: " + linkedList);
        System.out.println("size: " + linkedList.size());

        linkedList.add(0,20);
        System.out.println("List content: " + linkedList);
        System.out.println("size: " + linkedList.size());

        linkedList.add(6,10);
        System.out.println("List content: " + linkedList);
        System.out.println("size: " + linkedList.size());

        System.out.println("Removing the first element: " + linkedList.remove() + " from the list");
        System.out.println("List content: " + linkedList);
        System.out.println("Size: " + linkedList.size());

        System.out.println("Removing the first element: " + linkedList.remove() + " from the list");
        System.out.println("List content: " + linkedList);
        System.out.println("Size: " + linkedList.size());

        System.out.println("Removing the number at index 2: " + linkedList.get(2) + " from the list");
        linkedList.remove(2);
        System.out.println("List content: " + linkedList);
        System.out.println("Size: " + linkedList.size());

        System.out.println("Removing the first element: " + linkedList.remove() + " from the list");
        System.out.println("List content: " + linkedList);
        System.out.println("Size: " + linkedList.size());

        System.out.println("Removing the first element: " + linkedList.remove() + " from the list");
        System.out.println("List content: " + linkedList);
        System.out.println("Size: " + linkedList.size());

        System.out.println("Removing the first element: " + linkedList.remove() + " from the list");
        System.out.println("List content: " + linkedList);
        System.out.println("Size: " + linkedList.size());

        System.out.println("Removing the first element: " + linkedList.remove() + " from the list");
        System.out.println("List content: " + linkedList);
        System.out.println("Size: " + linkedList.size());




    }
}

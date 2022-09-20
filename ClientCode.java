public class ClientCode {
    public static void main(String[] args) {

        LinkedList<Integer> myList  = new LinkedList<>();
        myList.add(10);
        myList.add(25);
        myList.add(31);

        System.out.println(myList.compress());

        System.out.println(myList.min());
        System.out.println(myList.isSorted());
        System.out.println(myList.lastIndexOf(10));
        System.out.println(myList.countDuplicates());
        System.out.println(myList.hasTwoConsecutive());
        System.out.println(myList.deleteBack());

        myList.switchPairs();
        System.out.println(myList);

        myList.stutter();
        System.out.println(myList);

        myList.stretch(3);
        System.out.println(myList);
    }
}





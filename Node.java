
public class Node {

    int data;
    Node nextNode;
    Node previous;

    public Node(int data)
    {
        this.data = data;
        nextNode = null;
    }

    public Node(int data, Node nextNode, Node previous)
    {
        this.data =data;
        this.nextNode = nextNode;
    }


}

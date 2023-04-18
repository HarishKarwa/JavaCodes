package ds.linkedList;

public class LinkedListImpl {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public static void main(String args[]) {

    }

    /**
     * Checks if LL is empty
     * @return - true id LL is empty, else false
     */
    private boolean isEmpty() {
        if(this.head == null)
            return true;
        return false;
    }

    private boolean addNode(int data) {
        Node node = new Node();
        node.data = data;

        if (this.isEmpty()) {
            head = node;
            tail = node;
            tail.next = null;
            return true;
        }else {
            tail.next = node;
            tail = node;
            tail.next = null;
        }
        return false;
    }

}

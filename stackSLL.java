public class stackSLL {
    private SLL top;

    // methods
    public stackSLL() {
        top = new SLL();
    }

    public boolean isEmpty() {
        return (top.getHead() == null);
    }

    public void push(int n) {
        Node newNode = new Node(n);
        newNode.setNext(top.getHead());
        top.setHead(newNode);
    }

    public int pop() {
        if (top.getHead() == null) {
            System.out.println("stack underflow");
            return -1;
        }
        Node ans = top.getHead();
        top.setHead(top.getHead().getNext());
        return ans.getVal();
    }

    public int top() {
        if (top.getHead() == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.getHead().getVal();
    }
}

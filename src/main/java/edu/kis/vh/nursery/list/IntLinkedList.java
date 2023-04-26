package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private final int ERROR_CODE = -1;
    private Node lastNode;
    private int index;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNextNode(new Node(i));
            lastNode.getNextNode().setPrevNode(lastNode);
            lastNode = lastNode.getNextNode();
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }


    public int top() {
        if (isEmpty())
            return ERROR_CODE;
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return ERROR_CODE;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrevNode();
        return ret;
    }

}

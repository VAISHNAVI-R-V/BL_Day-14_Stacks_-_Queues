package com.bl.stackandques;

class StackImplementation {
    private Node top;

    public StackImplementation() {
        this.top = top;
    }

    void push(int element) {
        Node node = new Node();
        node.data = element;
        if (node == null) {
            node.next = null;
        } else {
            node.next = top;
            top = node;
        }
    }

    public void disply() {
        if (top == null)
            System.out.println("Stack is empty");
        else {
            Node temp = top;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

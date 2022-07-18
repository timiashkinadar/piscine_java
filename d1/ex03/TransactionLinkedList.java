package d1.ex03;

public class TransactionLinkedList {
    private Node head;
    private Node tail;
    private int num;

    public TransactionLinkedList() {
        this.head = null;
        this.tail = null;
        this.num = 0;
    }

    public void add_trans(Transaction transaction) {
        if (num == 0) {
            Node n_node = new Node(transaction, null, null);
            head = n_node;
            tail = n_node;
        } else {
            Node n_node = new Node(transaction, null, tail);
            tail.set_next(n_node);
            n_node.set_prev(tail);
            tail = tail.next;
        }
        num++;
    }

    class Node {
        private Transaction transaction;
        private Node prev;
        private Node next;

        Node(Transaction t, Node n, Node p) {
            this.transaction = t;
            this.prev = p;
            this.next = n;
        }

        public void set_trans(Transaction trans) {
            transaction = trans;
        }

        public void set_prev(Node p) {
            this.prev = p;
        }

        public void set_next(Node n) {
            this.next = n;
        }

        public Node get_next() {
            return this.next;
        }
    }
}


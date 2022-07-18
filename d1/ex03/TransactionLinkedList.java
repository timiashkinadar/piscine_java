package d1.ex03;

import java.util.UUID;

public class TransactionLinkedList implements TransactionsList {
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

    public void delete_by_id(UUID id){
        for (Node h = head; h != null; h = h.next) {
            if(h.get_trans().getId() == id){
                Node el = new Node(h.transaction, h.next, h.prev);
                if(el.prev == null)
                    head = el.next;
                else {
                    el.prev.next = el.next;
                    h.prev = null;
                }

                if(el.next == null)
                    tail = el.prev;
                else{
                    el.next.prev = el.prev;
                    h.next = null;
                }
                h.transaction = null;
                num--;
            }
            h = h.next;
        }
    }

    public Transaction [] list_to_arr() {
        Transaction [] transactions = new Transaction[num];

        int a = 0;
        for(Node t = head; t != null; t = t.next)
        {
            transactions[a] = t.transaction;
            a++;
        }
        return transactions;
    }
    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.transaction.print_tr());
            tmp = tmp.next;
            System.out.println();
        }
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

        public Transaction get_trans() {
            return this.transaction;
        }
    }
}


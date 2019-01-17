import java.util.ArrayList;

public class SinglyLinkedList {
    public Node head = null;

    public SinglyLinkedList(){
    }

    public SinglyLinkedList add(int value){
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node runner = this.head;
            while(runner.getNext() != null) {
                runner = runner.getNext();
            }
            runner.setNext(new Node(value));
        }
        return this;
    }

    public SinglyLinkedList remove(){
        if(this.head == null){
            return this;
        } else {
            Node runner = this.head;
            while(runner.getNext().getNext() != null){
                runner = runner.getNext();
            }
            runner.setNext(null);
        }
        return this;
    }

    public ArrayList<Integer> printValues() {
        ArrayList <Integer> list = new ArrayList<Integer>();
        Node runner = this.head;
        while(runner != null){
            list.add(runner.getVal());
            runner = runner.getNext();
        }
        return list;
    }



    




}
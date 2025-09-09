public class DoublyLinkedList {  //Doubly Linked List Class
    private Node head;           //////////////////////////////////////
    private Node tail;           // Fields inside Doubly LINKED Class//
    private int length;          //////////////////////////////////////

    class Node {         //INNER CLASS
        int value;
        Node next;
        Node prev;

        Node(int value) {   //INNER CLASS CONSTRUCTOR
            this.value = value;
        }
    }
    

    public DoublyLinkedList(int value) {  //CONSTRUCTOR FOR DOUBLY LINKED LIST
        Node newNode = new Node(value);    //The Node we use is from the INNER Class.
        head = newNode;
        tail = newNode;
        length = 1;
    }
         
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "\n");
            temp = temp.next;
        }
    }


    public void getTail() {
        System.out.println("Tail:" + tail.value);
    }
    public void getHead() {
        System.out.println("Head:"+ head.value);
    }
    public void getLength() {
        System.out.println("Length:" + length);
    }
    
    public void append(int value) {
        Node myNode = new Node(value);
        if (length == 0) {
            head = myNode;
            myNode = tail;
        } else {
            tail.next = myNode;
            myNode.prev = tail;
            tail = myNode;
        }
        length++;

    }
    
    public Node removeLast() {
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node myNode = new Node(value);
        if (length == 0) {
            head = myNode;
            tail = myNode;
        } else {
            myNode.next = head;
            head.prev = myNode;
            head = myNode;
        }
        length++;
    }

    public Node removeFirst() {
         Node temp = head;
        if (length == 0)
            return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
           
            head = temp.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    
    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
           } 
       } else {
           temp = tail;
           for (int i = length - 1; i > index; i--) {
               temp = temp.prev;
           }
       }
       return temp;
    }
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }
    
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node prev = get(index - 1);
            Node temp = prev.next;
            newNode.next = temp;
            temp.prev = newNode;
            prev.next = newNode;
            newNode.prev = prev;
            length++;
            return true;
        }
    }
    
    public Node remove(int index) {

        if (index < 0 || index >= length) {
            return null;
        } else if (index == 0) {
            removeFirst();
        } else if (index == length - 1) {
            removeLast();
        }
        Node before = get(index - 1);
        Node temp = before.next;
        before.next = temp.next;
        temp.next.prev = before;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;

    }
    

    public boolean isPalindrome() {
        Node forward = head;
        Node backward = tail;
        for (int i = 0; i < length / 2; i++) {
            if (forward.value != backward.value) {
                return true;
            }
            forward = forward.next;
            backward = backward.prev;
        }
        return true;
    }


    // DLL Reverse

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    // DLL Partition List

    public void partitionList(int x) {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;
        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                current.prev = prev1;
                prev1 = current;
            } else {
                prev2.next = current;
                current.prev = prev2;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        if (dummy2.next != null) {
            dummy2.next.prev = prev1;
        }
        head = dummy1.next;

        if (head != null) {
            head.prev = null;
        }
    }
}
 
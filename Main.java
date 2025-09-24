public class Main {
    public static void main(String[] args) {
        // LinkedList myLinkedList = new LinkedList(4);
        // myLinkedList.append(5);
        // myLinkedList.append(9);
        // myLinkedList.append(1);
        // myLinkedList.append(8);
        // myLinkedList.append(7);
        // myLinkedList.append(6);
        // myLinkedList.reverseBetween(2, 4);
        // myLinkedList.printList();

        // DoublyLinkedList myDLL = new DoublyLinkedList(7);
        // myDLL.append(5);
        // myDLL.prepend(4);
        // myDLL.append(3);
        // myDLL.append(2);
        // myDLL.partitionList(5);
        // myDLL.printList();      
        // }

        // Stack myStack = new Stack(2);
        // myStack.push(5);
        // myStack.push(6);
        // System.out.println("Poped out:- "+myStack.pop().value);
        // myStack.printStack();
        // myStack.getTop();

        // Queue myQueue = new Queue(1);
        // myQueue.enqueue(2);
        // myQueue.enqueue(3);
        // myQueue.getFirst();
        // myQueue.getLast();
        // myQueue.printQueue();
        // System.out.println("Dequeued Node:-" + myQueue.dequeue().value);
        //  myQueue.getFirst();
        // myQueue.getLast();
        // myQueue.printQueue();


        // BinarySearchTree myBST = new BinarySearchTree();
        // myBST.insert(47);
        // myBST.insert(21);
        // myBST.insert(76);
        // myBST.insert(18);
        // myBST.insert(27);
        // myBST.insert(52);
        // System.out.println(myBST.conatins(14));


        // HashTable myHashTable = new HashTable();
        // myHashTable.set("bolts", 1400);
        // myHashTable.set("washers", 50);
        // myHashTable.set("lumber", 70);
        // myHashTable.set("nails", 5500);
        // myHashTable.set("paints", 500);
        // System.out.println(myHashTable.keys());

        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.addeDGE("A", "B");
        myGraph.addeDGE("A", "C");
        myGraph.addeDGE("A", "D");
        myGraph.addeDGE("B", "D");
        myGraph.addeDGE("C", "D");
        myGraph.printGraph();
        myGraph.removeVertex("D");
        myGraph.printGraph();
    }
}

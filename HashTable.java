import java.util.ArrayList;
import java.util.HashMap;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;
    
    class Node {
        String key;
        int value;
        Node next;

        Node(String keyName, int value) {
            this.key = keyName;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];

            while (temp != null) {
                System.out.println("{" + temp.key + "=" + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length; // %dataMap.length gives remainder if length is 7 then remainder will be 0-6
        }
        return hash;
    }
    
    public void set(String key, int value) {
        //Hash the key to find index in the table.
        int index = hash(key);
        //Create a new Node
        Node newNode = new Node(key, value);
        //Checks if  table's index which we got is null or not
        if (dataMap[index] == null) {
            //if null we add the node
            dataMap[index] = newNode;
        } else {
            //else we create temp and loop through Linked lIst on the index
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public int get(String key) {
        //We will hash the key to find index
        int index = hash(key);
        //Create a temp node at the index
        Node temp = dataMap[index];

        //loops through the List
        while (temp != null) {
            //If temp.key=key
            if (temp.key.equals(key)) {
                return temp.value; //return temp.value
            }
            temp = temp.next; // temp.next
        }
        return 0; //if nothing then 0
    }
    
    public ArrayList keys() {
        //As we need an array of keys we used arraylist to create it.
        ArrayList<String> allKeys = new ArrayList<>();
        //traverse through dataMap
        for (int i = 0; i < dataMap.length; i++) {
            //create temp node at dataMap[i]
            Node temp = dataMap[i];
            //Checks linked list run on each hash
            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHadhMap = new HashMap<>();
        for (int i : array1) {
            myHadhMap.put(i, true);
        }

        for(int j: array2){
            if (myHadhMap.get(j) != null)
                return true;
        }
            return false;
        }
    }

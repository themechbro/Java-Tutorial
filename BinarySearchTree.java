import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (newNode.value == temp.value)
                return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }

            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    //  public boolean conatins(int x) {
    //      if (root == null)
    //          return false;

    //      Node temp = root;
    //      while (temp != null) {
    //          if (x < temp.value) {
    //              temp = temp.left;
    //          } else if (x > temp.value) {
    //              temp = temp.right;
    //          } else {
    //              return true;
    //          }
    //      }
    //        return false;
    //  }   
    private boolean rContains(Node currNode, int value) {
        if (currNode == null)
            return false;
        if (currNode.value == value)
            return true;

        if (value < currNode.value) {
            return rContains(currNode.left, value);
        } else {
            return rContains(currNode.right, value);
        }
    }

    private Node rInsert(Node currNode, int value) {
        if (currNode == null)
            return new Node(value);

        if (value < currNode.value) {
            currNode.left=rInsert(currNode.left, value);
        } else if (value > currNode.value) {
           currNode.right=rInsert(currNode.right, value);
        }

        return currNode;
}


public boolean rContains(int value) {
    return rContains(root, value);
}

public void rInsert(int value) {
    if (root == null) {
        root = new Node(value);
    }
    rInsert(root, value);
}

public int minValue(Node currNode) {
    while (currNode.left != null) {
        currNode = currNode.left;
    }
    return currNode.value;
}



private Node deleteNode(Node currNode, int value) {
    if (currNode == null)
        return null;

    if (value < currNode.value) {
        currNode.left = deleteNode(currNode.left, value);
    } else if (value > currNode.value) {
        currNode.right = deleteNode(currNode.right, value);
    } else {
        if (currNode.left == null && currNode.right == null)
            return null;
        if (currNode.left != null) {
            currNode = currNode.right;
        } else if (currNode.right != null) {
            currNode = currNode.left;
        } else {
            int subMinTree = minValue(currNode.right);
            currNode.value = subMinTree;
            currNode.right = deleteNode(currNode.right, subMinTree);
        }
    }
    return currNode;
}

public Node delete(int value) {
    return deleteNode(root, value);
}



public ArrayList<Integer> BFS() {
    Node currNode = root;
    Queue<Node> queue = new LinkedList<>(); // Use Node type, not Integer
    ArrayList<Integer> result = new ArrayList<>();

    queue.add(currNode);

    while (!queue.isEmpty()) {
        currNode = queue.remove();
        result.add(currNode.value);

        if (currNode.left != null) {
            queue.add(currNode.left);
        }
        if (currNode.right != null) {
            queue.add(currNode.right);
        }
    }
    return result;
}

public ArrayList<Integer> DFSPreOrder() {
    ArrayList<Integer> results = new ArrayList<>();

    class Traverse {
        Traverse(Node currNode) {
            results.add(currNode.value);
            if (currNode.left != null) {
                new Traverse(currNode.left);
            }
            if (currNode.right != null) {
                new Traverse(currNode.right);
            }
        }
    }
    new Traverse(root);
    return results;
}

public ArrayList<Integer> DFSPostOrder() {
    ArrayList<Integer> results = new ArrayList<>();

    class Traverse {
        Traverse(Node currNode) {

            if (currNode.left != null) {
                new Traverse(currNode.left);
            }
            if (currNode.right != null) {
                new Traverse(currNode.right);
            }
            results.add(currNode.value);
        }
    }
    new Traverse(root);
    return results;
}

public ArrayList<Integer> DFSInorder() {
    ArrayList<Integer> results = new ArrayList<>();

    class Traverse {
        Traverse(Node currNode) {
            if (currNode == null)
                return;
            if (currNode.left != null) {
                new Traverse(currNode.left);

            }
            results.add(currNode.value);
            if (currNode.right != null) {
                new Traverse(currNode.right);
            } 
        }
    }
    new Traverse(root);
    return results;
}
}

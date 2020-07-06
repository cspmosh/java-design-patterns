package BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Node<T>
{
    public T value;
    public Node<T> left, right, parent;

    public Node(T value)
    {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right)
    {
        this.value = value;
        this.left = left;
        this.right = right;

        left.parent = right.parent = this;
    }

    public Iterator<Node<T>> preOrder()
    {
        ArrayList<Node<T>> preOrderList = new ArrayList<>();
        addToList(this, preOrderList);
        return preOrderList.iterator();
    }

    // recursively add nodes to list in pre-order traversal
    private void addToList(Node<T> node, List<Node<T>> nodes){
        nodes.add(node);
        if (node.left != null){
            addToList(node.left, nodes);
        }
        if (node.right != null){
            addToList(node.right, nodes);
        }
    }
}

package ds.w11.christianfarreltanmel.soalE;

import ds.w11.christianfarreltanmel.treeNode;
import static ds.w11.christianfarreltanmel.bfs.breadthFirstTraversalLeaf;

import java.util.List;

public class soalE {
    public static void main(String[] args) {
        treeNode root = new treeNode("A");
        root.leftChild = new treeNode("B");
        root.rightChild = new treeNode("C");
        root.leftChild.leftChild = new treeNode("D");
        root.leftChild.rightChild = new treeNode("E");
        root.rightChild.leftChild = new treeNode("F");
        root.rightChild.rightChild = new treeNode("G");

        List<String> result = breadthFirstTraversalLeaf(root);
        System.out.println(result);
    }
}
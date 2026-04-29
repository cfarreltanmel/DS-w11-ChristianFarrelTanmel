package ds.w11.christianfarreltanmel.soalE;

import java.util.List;
import static ds.w11.christianfarreltanmel.soalE.bfs.breadthFirstTraversal;

public class soalE {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");
        root.leftChild = new TreeNode("B");
        root.rightChild = new TreeNode("C");
        root.leftChild.leftChild = new TreeNode("D");
        root.leftChild.rightChild = new TreeNode("E");
        root.rightChild.leftChild = new TreeNode("F");
        root.rightChild.rightChild = new TreeNode("G");

        List<String> result = breadthFirstTraversal(root);
        System.out.println(result);
    }
}

class TreeNode {
    String value;
    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(String value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }
}
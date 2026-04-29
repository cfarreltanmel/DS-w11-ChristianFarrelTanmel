package ds.w11.christianfarreltanmel.soalF;

import java.util.List;
import java.util.Scanner;
import static ds.w11.christianfarreltanmel.soalF.dfs.depthFirstTraversal;

public class soalF {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");
        root.leftChild = new TreeNode("B");
        root.rightChild = new TreeNode("C");
        root.leftChild.leftChild = new TreeNode("D");
        root.leftChild.rightChild = new TreeNode("E");
        root.rightChild.leftChild = new TreeNode("F");
        root.rightChild.rightChild = new TreeNode("G");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tree level you want to print: ");
        int level = scanner.nextInt();

        List<String> result = depthFirstTraversal(root);
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
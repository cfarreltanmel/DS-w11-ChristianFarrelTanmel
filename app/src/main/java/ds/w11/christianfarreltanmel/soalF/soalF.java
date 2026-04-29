package ds.w11.christianfarreltanmel.soalF;

import java.util.List;
import java.util.Scanner;
import static ds.w11.christianfarreltanmel.bfs.breadthFirstTraversalLevel;
import ds.w11.christianfarreltanmel.treeNode;

public class soalF {
    public static void main(String[] args) {
        treeNode root = new treeNode("A");
        root.leftChild = new treeNode("B");
        root.rightChild = new treeNode("C");
        root.leftChild.leftChild = new treeNode("D");
        root.leftChild.rightChild = new treeNode("E");
        root.rightChild.leftChild = new treeNode("F");
        root.rightChild.rightChild = new treeNode("G");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the tree level you want to print: ");
        int level = scanner.nextInt();
        if (level == 0) {
            System.out.println(root.value);
        } else {
            List<String> result = breadthFirstTraversalLevel(root);
            int startIndex = (int) Math.pow(2, level) - 1;
            int endIndex = (int) Math.pow(2, level + 1) - 2;
            if (startIndex < result.size()) {
                for (int i = startIndex; i <= endIndex && i < result.size(); i++) {
                    System.out.print(result.get(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("Level " + level + " does not exist in the tree.");
            }
        }
        scanner.close();
    }
}
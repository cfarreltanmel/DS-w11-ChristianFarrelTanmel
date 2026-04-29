package ds.w11.christianfarreltanmel;

import java.util.ArrayList;
import java.util.List;

public class bfs {
    public static List<String> breadthFirstTraversalLeaf(treeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<treeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            treeNode currentNode = queue.remove(0);
            if (currentNode.leftChild == null && currentNode.rightChild == null) {
                result.add(currentNode.value);
            }
            if (currentNode.leftChild != null) {
                queue.add(currentNode.leftChild);
            }
            if (currentNode.rightChild != null) {
                queue.add(currentNode.rightChild);
            }
        }
        return result;
    }

    public static List<String> breadthFirstTraversalLevel(treeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<treeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            treeNode currentNode = queue.remove(0);
            result.add(currentNode.value);
            if (currentNode.leftChild != null) {
                queue.add(currentNode.leftChild);
            }
            if (currentNode.rightChild != null) {
                queue.add(currentNode.rightChild);
            }
        }
        return result;
    }
}
package ds.w11.christianfarreltanmel.soalE;

import java.util.ArrayList;
import java.util.List;

public class bfs {
    public static List<String> breadthFirstTraversalLeaf(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove(0);
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
}
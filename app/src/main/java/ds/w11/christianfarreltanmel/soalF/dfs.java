package ds.w11.christianfarreltanmel.soalF;

import java.util.List;
import java.util.ArrayList;
public class dfs {
    public static List<String> depthFirstTraversal(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.value);
        if (root.leftChild != null) {
            result.addAll(depthFirstTraversal(root.leftChild));
        }
        if (root.rightChild != null) {
            result.addAll(depthFirstTraversal(root.rightChild));
        }
        return result;
    }
}
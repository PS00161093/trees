package trees.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewTree {

    public ArrayList<Integer> leftView(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
                if (i == 1) result.add(temp.data);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
        }

        return result;
    }
}


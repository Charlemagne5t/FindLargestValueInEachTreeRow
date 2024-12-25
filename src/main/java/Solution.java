import java.util.*;

class Solution {
    public List<Integer> largestValues(TreeNode root) {

        Deque<TreeNode> q = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                max = Math.max(max, cur.val);
                if(cur.left != null) {
                    q.offer(cur.left);
                }
                if(cur.right != null) {
                    q.offer(cur.right);
                }
            }
            res.add(max);
        }
        return res;
    }
}

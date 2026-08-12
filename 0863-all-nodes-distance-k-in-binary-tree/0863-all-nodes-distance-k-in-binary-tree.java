/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void markParents(TreeNode root,Map<TreeNode , TreeNode>parentTrack,TreeNode target){
        Queue<TreeNode>q=new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null){
                parentTrack.put(curr.left,curr);
                q.offer(curr.left);
            }
            if(curr.right!=null){
                parentTrack.put(curr.right,curr);
                q.offer(curr.right);
            }
        }

    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       Map<TreeNode , TreeNode>parentTrack = new HashMap<>();
       markParents(root,parentTrack,target);
       Map<TreeNode,Boolean>visited = new HashMap<>();
       Queue<TreeNode>q= new LinkedList<TreeNode>();
       q.offer(target);
       visited.put(target,true);
       int curLevel=0;
       while(!q.isEmpty()){
        int size=q.size();
        if(curLevel==k) break;
        curLevel++;
        for(int i=0;i<size;i++){
            TreeNode curr= q.poll();
            if(curr.left!=null && visited.get(curr.left)==null){
                q.offer(curr.left);
                visited.put(curr.left,true);
            }
              if(curr.right!=null && visited.get(curr.right)==null){
                q.offer(curr.right);
                visited.put(curr.right,true);
            }
            if(parentTrack.get(curr)!=null && visited.get(parentTrack.get(curr))==null){
                q.offer(parentTrack.get(curr));
                visited.put(parentTrack.get(curr),true);
            }
            
        }
       }
       List<Integer>ans= new ArrayList<>();
       while(!q.isEmpty()){
        TreeNode curr = q.poll();
        ans.add(curr.val);
       }
       return ans;
    }
}
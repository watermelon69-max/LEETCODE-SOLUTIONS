/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode build(int[]inorder,int iS, int iE,int[]postorder,int pS,int pE,Map<Integer,Integer>inMap){
        if(pS>pE || iS>iE) return null;
        
        TreeNode node=new TreeNode(postorder[pE]);
        int isRoot=inMap.get(postorder[pE]);
        int numsLeft=isRoot - iS;

        node.left=build(inorder,iS,isRoot - 1 , postorder , pS, pS+numsLeft-1,inMap);

        node.right=build(inorder,isRoot+1,iE,postorder,pS+numsLeft,pE-1,inMap);

        return node;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length !=postorder.length && inorder==null || postorder==null){
            return null;
        } 
        Map<Integer,Integer>inMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root= build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,inMap);

        return root;
        
    }
}
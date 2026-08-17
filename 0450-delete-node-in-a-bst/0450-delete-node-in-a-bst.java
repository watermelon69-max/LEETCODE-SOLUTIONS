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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        
        if(key<root.val){
           root.left= deleteNode(root.left,key);

        }
        else if(key>root.val){

            root.right=deleteNode(root.right,key);
        }

        //abh agr key milgyi to how to remove it 
        
       else{
             //case 1 : when there is not child of the target
             if(root.left==null && root.right==null){
                return null;
             }
             //casw 2 : where there is one child of the target node existt
             if(root.left==null){
                return root.right;
             }
             if(root.right==null){
                return root.left;
             }

             //case 3 : when both the child exist then how to choose which one will take its place 
             TreeNode successor= root.right;
             while(successor.left!=null){
                successor=successor.left;

             }
             root.val=successor.val;

             //now for deleting the node from the right subtree 
             root.right=deleteNode(root.right,successor.val);
     
      }
      return root;
    }
}
class Solution {
    public void insert(TreeNode root, int val){
        if(val<root.val){   //attacha to left
            if(root.left == null) root.left= new TreeNode(val);
            else insert(root.left,val);
        }
        else{   //val>root.val ->  attachh to ight
            if(root.right == null) root.right = new TreeNode(val);
            else insert(root.right,val);
        }
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        insert(root,val);
        return root;
    }
}
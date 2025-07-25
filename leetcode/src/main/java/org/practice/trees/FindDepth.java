package org.practice.trees;

import com.sun.source.tree.Tree;

/*
This is was part of thinking exercise for recursion
Build function is not correct , its just a quick work around
essence here is findDepth function


 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

}



public class FindDepth {

    public static int findDepth(TreeNode root) {

        if(root == null) return 0;

        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);

        return 1+ Math.max(leftDepth, rightDepth);
    }

    private static TreeNode addLeftNode(TreeNode root, int val)
    {
        TreeNode newNode = new TreeNode(val);
        root.left = newNode;
        return root;
    }

    private static TreeNode addRightNode(TreeNode root, int val)
    {
        TreeNode newNode = new TreeNode(val);
        root.right = newNode;
        return root;
    }

    /*
    Temporary function to build binary tree
     */
    private static TreeNode buildTree() {
        TreeNode root = new TreeNode(4);

        TreeNode node2 = new TreeNode(2);
        addLeftNode(node2,8 );
        addRightNode(node2,1 );
        root.setLeft(node2);
        root.setRight(new TreeNode(6 ));
        return root;

    }

    public static void main(String[] args) {
            TreeNode root = buildTree();
            int depth =findDepth(root);
             System.out.println("Depth of the tree is: " + depth);
    }
}

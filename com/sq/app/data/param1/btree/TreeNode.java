package com.sq.app.data.param1.btree;

/**
 * @Author fanht
 * @Description
 * @Date 2021/3/19 5:14 PM
 * @Version 1.0
 */
public class TreeNode {


    private int val;


    private TreeNode left;

    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

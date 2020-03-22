package com.blankj.ADT;

/**
 * @Author: Edward Gavin
 * @Create: 2020-03-11 17:20
 */
public class BinNode {
    public int data;
    public BinNode left;
    public BinNode right;
    public BinNode parent;

    public int height;
    public int size;
    public int color;

    public BinNode(int data, BinNode left, BinNode right, BinNode parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public BinNode(int value, BinNode left, BinNode right) {
        this(value, left, right, null);
    }

    public BinNode(int value) {
        this(value, null, null);
    }

    public boolean isLeft() {
        return this.left == null && this.right == null;
    }

    public BinNode insertAsLC(int value) {
        BinNode left = new BinNode(value);
        return left;
    }

    public BinNode insertAsRC(int value) {
        BinNode right = new BinNode(value);
        return right;
    }
}

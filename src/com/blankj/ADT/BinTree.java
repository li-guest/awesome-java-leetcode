package com.blankj.ADT;

import java.util.*;

/**
 * @Author: Edward Gavin
 * @Create: 2020-03-11 19:52
 */
public class BinTree {
    protected BinNode root;
    protected int size;


    public BinTree() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return 0;
    }

    public int height() {
        return 0;
    }

    public void preOrderRecursion(BinNode p) {
        if (p == null) {
            return ;
        }
        visit(p);
        preOrderRecursion(p.left);
        preOrderRecursion(p.right);
    }

    public void preOrder_iteration_1(BinNode p) throws Exception {
        if (p == null) {
            return ;
        }
        Stack stack = new Stack();
        stack.push(p);
        while (!stack.empty()) {
            BinNode x = (BinNode) stack.pop();
            visit(x);
            if(x.right != null){
                stack.push(x.right);
            }
            if (x.left != null) {
                stack.push(x.left);
            }

        }
    }

    public void visit(BinNode p) {
        System.out.println(p.data);
    }

    public void perOrder_iteration_2(BinNode p) throws Exception {
        Stack stack = new Stack();
        while (true) {
            visitAlongLeftBranch(p, stack);
            if(stack.empty()) break;
            p = (BinNode)stack.pop();
        }
    }

    public void visitAlongLeftBranch(BinNode p, Stack stack) {
        while (p != null) {
            visit(p);
            stack.push(p.right);
            p = p.left;
        }
    }

    public void inOrderRecursion(BinNode p) {
        if (p == null) {
            return;
        }
        inOrderRecursion(p.left);
        visit(p);
        inOrderRecursion(p.right);
    }

    public void inOrdeIteration_1(BinNode p) throws Exception {
        Stack stack = new Stack();
        while (true) {
            goAlongLeftBranch(p, stack);
            if (stack.empty()) break;
            p = (BinNode)stack.pop();
            visit(p);
            p = p.right;
        }
    }

    public void goAlongLeftBranch(BinNode p, Stack stack) {
        while (p != null) {
            stack.push(p);
            p = p.left;
        }
    }

    public void postOrder(BinNode p) throws Exception {
        if (p == null)
            return ;
        Stack stack = new Stack();
        stack.push(p);
        while(!stack.empty()){
            BinNode node = (BinNode)stack.pop();
            visit(node);
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
    }

    public void levelOrder(BinNode p) {
        Queue<BinNode> binNodeQueue = new LinkedList<>();
        binNodeQueue.add(p);
        while(!binNodeQueue.isEmpty()){
            BinNode x = binNodeQueue.poll();
            visit(x);
            if (x.left != null) binNodeQueue.add(x.left);
            if (x.right != null) binNodeQueue.add(x.right);
        }
    }

    public List<List<Integer>> levelOrder_2(BinNode p) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (p == null)
            return levels;
        Queue<BinNode> queue = new LinkedList<BinNode>();
        queue.add(p);
        int level = 0;
        while(!queue.isEmpty()){
            levels.add(new ArrayList<Integer>());
            int level_length = queue.size();
            for (int i = 0; i < level_length; ++i) {
                BinNode node = queue.remove();
                levels.get(level).add(node.data);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level ++;
        }
        return levels;
    }

    public void insertAsRoot(int data) {
        size = 1;
        BinNode bn = new BinNode(data, null, null, null);
        root = bn;
    }

    public void insertAsLC(BinNode x, int data) {
        size = size + 1;
        BinNode newNode = new BinNode(data, null, null, x);
        x.left = newNode;
    }

    public void insertAsRC(BinNode x, int data) {
        size = size +1;
        BinNode newNode = new BinNode(data, null, null, x);
        x.right = newNode;
    }

    public void remove() {

    }

    public int findMax() {
        return 0;
    }

    public int findMin() {
        return 1;
    }

    public BinNode findNode() {
        return null;
    }

}


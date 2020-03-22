package com.blankj.ADT;


public class MyNode {

    /**
     * 链表中的节点，val 代表数据， next 代表指向下一个节点的引用
     */
    class Node {
        Node next = null;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node() {

        }
    }

    Node header = new Node();
    int size = 0;

    /**
     * 获取链表中某个位置的数据，
     * @param index 位置
     * @return 所在位置的数据
     */
    public int get(int index) {
        if(index >= size || index < 0) return -1;
        Node p = header;
        int i = -1;

        while (i < index) {
            p = p.next;
            i++;
        }
        return p.val;
    }

    public int getValue(int index) {
        if (index > size || index < 0) return -1;
        Node p = header;
        int i = -1;
        while (p.next != null) {
            if (i == index) {
                return p.val;
            }
            i ++;
            p = p.next;
        }
        return -1;
    }

    /**
     * 判空
     * @return
     */
    public boolean isEmpty() {
        return header.next == null;
    }

    /**
     * 判最后一个元素
     * @param node
     * @return
     */
    public boolean isLast(Node node) {
        return node.next == null;
    }

    /**
     * 在任意位置插入
     * @param index
     * @param val
     */
    public void addNode(int index, int val) {
        Node p = header;
        int i = -1;

        if (index >= 0 && index <= size) {
            Node newNode = new Node(val);
            if (index == 0) {
                newNode.next = header.next;
                header.next = newNode;
            } else {
                while (i < index - 1) {
                    p = p.next;
                    i++;
                }
                newNode.next = p.next;
                p.next = newNode;
            }
        }
        size ++;
    }

    /**
     * 链表的长度
     * @return 返回链表的长度
     */
    public int listLength() {
        Node p = header;
        int i = 0;
        while (p.next != null) {
            i ++;
            p = p.next;
        }
        return i;
    }

    /**
     * 查找某个节点前一个节点，并返回此节点Node
     * @param val 某个节点中的数据
     * @return 返回前一个节点
     */
    public Node findPrevious(int val) {
        Node temp = header;
        while (temp.next != null) {
            if (temp.next.val == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 在链表的头部插入
     * @param val
     */
    public void addAtHeader(int val) {
        addNode(0, val);
    }

    /**
     * 在链表的尾部插入
     * @param val
     */
    public void addAtTail(int val) {
        addNode(size, val);
    }

    /**
     * 打印输出链表中的所有数据
     */
    public void printList() {
        Node temp = header;
        while (temp.next != null) {
            System.out.println(temp.next.val);
            temp = temp.next;
        }
    }

    public void deleteNode(int index) {
        if (index > 0 && index < size) {
            if (index == 0) {
                header.next = header.next.next;
            } else {
                Node p = header;
                int i = -1;
                while (i < index - 1) {
                    p = p.next;
                    i++;
                }
                p.next = p.next.next;
            }
            size --;
        }
    }

    public static void main(String[] args) {
        MyNode myNode = new MyNode();
        myNode.addNode(0, 0);
        myNode.addNode(1, 1);
        myNode.addNode(2, 2);
        myNode.addNode(3, 3);
        myNode.addNode(4, 4);
        //System.out.println(myNode.get(1));
        //myNode.printList();
        //myNode.deleteNode(2);
        //myNode.printList();
//        Node pre = myNode.findPrevious(4);
//        System.out.println(pre.val);
//        System.out.println(myNode.getValue(1));
//        System.out.println(myNode.get(4));
//        System.out.println(myNode.header.val);
//        System.out.println(myNode.header.next.val);
//
//        System.out.println(myNode.listLength());

        MyNode node2 = new MyNode();
        node2.addNode(0,4);
        node2.addNode(1, 3);
    }
}

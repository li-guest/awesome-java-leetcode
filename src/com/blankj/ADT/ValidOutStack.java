package com.blankj.ADT;

import java.util.LinkedList;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-17 15:58
 */
public class ValidOutStack {

    public boolean validOutStackSeq(int[] sourceArray, LinkedList destArray) throws Exception {
        Stack stack = new Stack();
        int length = sourceArray.length;
        for (int i = 0; i < length; i++) {
            stack.push(sourceArray[i]);
            while (stack.top() == destArray.getFirst() && !stack.empty()) {
                stack.pop();
                destArray.removeFirst();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) throws Exception {
        int[] array = {1,2,3,4,5};
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);


        ValidOutStack validOutStack = new ValidOutStack();
        System.out.println(validOutStack.validOutStackSeq(array, linkedList));

    }

}


class Stack{
    private LinkedList ll = new LinkedList();

    public void push(Object obj){
        ll.addFirst(obj);
    }

    public Object pop() throws Exception{
        return ll.removeFirst();
    }

    public void display(){
        ll.toString();
    }

    public Object top(){
        return ll.getFirst();
    }

    public boolean empty() {
        return ll.isEmpty();
    }

}
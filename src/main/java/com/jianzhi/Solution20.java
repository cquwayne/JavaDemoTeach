package com.jianzhi;

import java.util.Stack;

public class Solution20 {

    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        if (minStack.isEmpty() || node<=minStack.peek()){
            minStack.push(node);
        }else {
            minStack.push(minStack.peek());
        }

        mainStack.push(node);
    }

    public void pop() {
            minStack.pop();
        mainStack.pop();
    }

    public int top(){
        return mainStack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}

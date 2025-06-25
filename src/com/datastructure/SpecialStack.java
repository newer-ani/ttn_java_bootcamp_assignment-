package com.datastructure;

public class SpecialStack {

    int [] origianlstack = new int[10];
    int [] minstack= new int[10];
    int top=-1;
    int capacity;

    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return origianlstack[top--];
    }
    public void push(int a) {
        if (isFull()) {
            System.out.println("stack is full");
            return;
        }
        top++;
        origianlstack[top] = a;
        if (top == 0) {
            minstack[top] = a;
        } else {
            minstack[top] = Math.min(a, minstack[top - 1]);
        }
    }
    public boolean isEmpty()
    {
      if(top == -1)
          return true;
      else
          return false;
    }

    public boolean isFull()
    {
        if(top == capacity - 1)
            return true;
        else
            return false;
    }

    public int getMin()
    {
        if (isEmpty()) {
        System.out.println("Stack is empty");
        return -1;
    }
        return minstack[top];
    }
}

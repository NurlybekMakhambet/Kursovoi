package com.company;

public class StackMass extends Main{
    int size,top;
    int [] mass;

    public StackMass(int s){
        size = s;
        mass = new int[size];
        top = 0;
    }

    public boolean isEmpty(){
        return (top == 0);
    }

    public void push(int a){
        int i = ++top;
        mass[i]=a;
        System.out.println("Top is= "+ top);
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            return mass[top--];
        }
    }

    public int pick(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }
        else {
            return mass[top];
        }

    }

}

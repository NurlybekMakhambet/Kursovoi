package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        StackMass stack = new StackMass(5);

        System.out.println(stack.top);

        stack.push(2);

        stack.push(4);

        stack.push(1);

        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.pop());
        

    }
}

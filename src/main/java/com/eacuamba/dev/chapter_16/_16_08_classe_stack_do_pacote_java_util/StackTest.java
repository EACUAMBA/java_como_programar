package com.eacuamba.dev.chapter_16._16_08_classe_stack_do_pacote_java_util;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        stack.push(10L);
        System.out.println("Pushed 10L");
        printStackState(stack);

        stack.push(200.00);
        System.out.println("Pushed 200.00");
        printStackState(stack);

        stack.push(1);
        System.out.println("Pushed 1");
        printStackState(stack);

        stack.push(1968452363554L);
        System.out.println("Pushed 1968452363554L");
        printStackState(stack);

        stack.push(72645.82667);
        System.out.println("Pushed 72645.82667");
        printStackState(stack);

        stack.push(16524433.988);
        System.out.println("Pushed 16524433.988");
        printStackState(stack);

        try{
            Number removedFromStack = null;

            while (true){
                removedFromStack = stack.pop();
                System.out.printf("Removed from stack: %s%n", removedFromStack);
                printStackState(stack);
            }
        }catch (EmptyStackException emptyStackException){
            emptyStackException.printStackTrace();
        }
    }

    private static void printStackState(Stack<Number> stack) {
        if(stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.printf("The stack contains: %s (top)%n", stack);
    }
}

package learnings.basic;

import java.util.Stack;

public class StackExample {

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for(Integer i : stack) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println(stack.pop());

        System.out.println(stack.search(2));
    }
}

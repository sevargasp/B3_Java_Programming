package day42_a_collection.list;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        // push() --- > add()
        // pop() ---- > remove()
        // peek() --- > get()
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek()); // returns what was added at last - what is at the top of my data structure - last element

        stack.pop(); // removes the elements which was at the top
        System.out.println(stack);
        System.out.println("Top of my stack: " + stack.peek());

        System.out.println(stack.pop()); // removed what was at the top but since I used it in print statement, I will see what was removed
        System.out.println(stack);
        System.out.println("Top of my stack: " + stack.peek());

        // Q: But if I want to remove from the bottom. Can I?
        // A: There is way to do it. But that is not the ides of LIFO

        stack.remove(0); // this will remove the FIRST element added
        System.out.println(stack);

    }
}
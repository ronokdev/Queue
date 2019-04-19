import java.util.Arrays;
import java.util.Stack;

public class queue_using_two_stack {
    public static void main(String[] args) {
        queue q = new queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();

        enQueue(q.stack1);  // enquingggg
        printStack(q.stack1);
        deQueue(q);
        printStack(q.stack2);

        //print in ascending order
        System.out.println("Printing in Ascending Mode → ");
        printInAscending(q);


    }

    static class queue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    }


    // push all the element to stack1
    static void enQueue(Stack<Integer> stack1) {
        push(stack1);
    }

    static void push(Stack<Integer> stack) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    }

    //pop from stack1 & push to stack2
    static void deQueue(queue q) {
        while (!q.stack1.isEmpty()) {
            q.stack2.push(q.stack1.pop());
        }

    }

    // pop from stack2
    static void printInAscending(queue q) {
        while (!q.stack2.isEmpty()) {
            System.out.println(q.stack2.pop());
        }

    }


    // see stack
    static boolean printStack(Stack<Integer> stack) {
        System.out.println(Arrays.toString(stack.toArray()));
        return true;
    }


}

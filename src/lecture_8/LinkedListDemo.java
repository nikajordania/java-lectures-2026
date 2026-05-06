
package lecture_8;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Add to front/back
        queue.addFirst("FIRST");
        queue.addLast("LAST");

        // Remove from front/back
        queue.removeFirst();
        queue.removeLast();

        // Peek (does not remove)
        System.out.println("peek(): " + queue.peek());
        System.out.println("peekFirst(): " + queue.peekFirst());
        System.out.println("peekLast(): " + queue.peekLast());

        // Poll (removes)
        System.out.println("poll(): " + queue.poll());

        // Stack behavior
        queue.push("StackPush");
        System.out.println(queue.pop());

        // Random access is slow, but possible:
        System.out.println("get(1): " + queue.get(1));

        // Iterate normally
        for (String s : queue) System.out.println(s);

        // Iterate with iterator (good for removing!)
        Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("Bob")) it.remove();
        }
    }
}

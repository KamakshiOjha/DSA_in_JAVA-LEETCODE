public class Stack_main {
    public static void main(String[] args) {
        Stack s = new Stack(2);
        s.push(10);
        s.push(3);
        s.push(9);
        s.printStack();
        System.out.println("after pop");
        s.pop();
        s.printStack();

    }
}

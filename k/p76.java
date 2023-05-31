import java.util.*;

class GenericStack<E> {
    ArrayList<E> arr;
    int top = -1;
    int size;

    GenericStack(int size) {
        this.size = size;
        this.arr = new ArrayList<E>(size);
    }

    void push(E d) {
        if (top == size - 1)
            System.out.println("Stack Overflow!");
        else {
            top = top + 1;
            if (arr.size() > top)
                arr.set(top, d);
            else
                arr.add(d);
        }
    }

    E top() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        } else
            return arr.get(top);
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Undeflow!");
        else
            top--;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < top; i++)
            str = str + String.valueOf(arr.get(i)) + "->";
        str += String.valueOf(arr.get(top));
        return str;
    }
}

class p76 {
    public static void main(String[] args) {
        GenericStack<String> s1 = new GenericStack<>(3);
        GenericStack<Double> s2 = new GenericStack<>(3);
        System.out.println("For String Stack: ");
        s1.push("Com");
        s1.push("put");
        s1.push("er");
        s1.push("yes");
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.push("yes");
        System.out.println(s1);
        System.out.println("is Empty: " + s1.isEmpty());
        System.out.println("Top: " + s1.top());
        System.out.println();
        System.out.println("For Double Stack: ");
        s2.push(10.2);
        s2.push(11.2);
        s2.push(12.234);
        s2.push(35.2134);
        System.out.println(s2);
        s2.pop();
        System.out.println(s2);
        s2.push(35.2134);
        System.out.println(s2);
        System.out.println("is Empty: " + s2.isEmpty());
        System.out.println("Top: " + s2.top());
    }
}

import java.util.*;

interface Stack {
    boolean isEmpty();

    int getSize();

    boolean isFull();
}

class StackOverflow extends Exception {
    StackOverflow() {
        super("Stack is Full");
    }
}

class StackUnderflow extends Exception {
    StackUnderflow() {
        super("Stack is Empty");
    }
}

interface IStack extends Stack {
    void push(int x) throws StackOverflow;

    void push(int[] x) throws StackOverflow;

    int pop() throws StackUnderflow;

    void printStack();
}

interface DStack extends Stack {
    void push(double x) throws StackOverflow;

    void push(double[] x) throws StackOverflow;

    double pop() throws StackUnderflow;

    void printStack();
}

abstract class StackInitialImplementation implements Stack {
    int[] intarr;
    double[] darr;
    int top;
    int capacity;

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == capacity) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        if (top == -1) {
            return 0;
        } else {
            return top + 1;
        }
    }
}

class IntStack extends StackInitialImplementation implements IStack {
    IntStack(int size) {
        intarr = new int[size];
        top = -1;
        capacity = intarr.length;
    }

    IntStack(int[] arr) {
        intarr = arr;
        top = arr.length-1;
        capacity = arr.length;
    }

    public void push(int x) throws StackOverflow {

        try {
            if (isFull()) {
                throw new StackOverflow();
            }
            if (top == -1) {
                intarr[++top] = x;
            } else {
                intarr[++top] = x;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
          
    }

    public void push(int[] arr) {
        intarr = arr;
        top = arr.length-1;
    }

    public int pop() throws StackUnderflow {

        if (isEmpty()) {
            throw new StackUnderflow();
        } else {
            return intarr[top--];
        }

    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(intarr[i] + ",");
        }
        System.out.println();
    }
}

class DoubleStack extends StackInitialImplementation implements DStack {
    DoubleStack(int size) {
        darr = new double[size];
        top = -1;
        capacity = darr.length;
    }

    DoubleStack(double[] arr) {
        darr = arr;
        top = arr.length-1;
        capacity = arr.length;
    }

    public void push(double[] arr) {
        darr = arr;
        top = arr.length-1;
    }

    public void push(double x) throws StackOverflow {

        if (isFull()) {
            throw new StackOverflow();
        }
        if (top == -1) {
            darr[++top] = x;
        } else {
            darr[++top] = x;
        }

    }

    public double pop() throws StackUnderflow {

        if (top == -1) {
            throw new StackUnderflow();
        } else {
            return darr[top--];
        }
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(darr[i] + ",");
        }
        System.out.println();
    }

}

class Solution {
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int input = sc.nextInt();
            // Complete the code
            switch (input) {
                case 1:
                    // IntStack
                    int i = 0;
                    int s = sc.nextInt();// size
                    IntStack s1 = new IntStack(s);
                    while (i < s) {
                        int item = sc.nextInt();
                        try {
                            s1.push(item);
                        } catch (StackOverflow sl) {
                            System.out.println(sl);
                        }
                        i++;
                    }

                    try {
                        s1.push(300);
                    } catch (StackOverflow sl) {
                        System.out.println(sl);
                    }
                    s1.printStack();

                    break;
                case 2:
                    int[] a = { 1, 2, 3, 4, 5, 6, 7 };
                    IntStack s2 = new IntStack(a);
                    s2.printStack();
                    for (int j = 0; j < s2.capacity + 1; j++) {

                        try {
                            s2.pop();
                        } catch (StackUnderflow su) {
                            System.out.println(su);
                        }

                    }
                    break;

                case 3:
                    // DoubleStack
                    int l = 0;
                    int d = sc.nextInt();// size
                    DoubleStack s3 = new DoubleStack(d);
                    while (l < d) {
                        double item = sc.nextDouble();
                        try {
                            s3.push(item);
                        } catch (StackOverflow sl) {
                            System.out.println(sl);
                        }
                        l++;
                    }

                    try {
                        s3.push(300.0);
                    } catch (StackOverflow sl) {
                        System.out.println(sl);
                    }
                    s3.printStack();

                    break;
                case 4:
                    double[] b = { 1, 2, 3, 4, 5, 6, 7 };
                    DoubleStack s4 = new DoubleStack(b);
                    s4.printStack();
                    for (int k = 0; k < s4.capacity + 1; k++) {

                        try {
                            s4.pop();
                        } catch (StackUnderflow su) {
                            System.out.println(su);
                        }

                    }
                    break;
                case 5:
                    DoubleStack d1 = new DoubleStack(5);
                    IntStack i1 = new IntStack(5);
                    ImplementedInterfaceNames(d1);
                    ImplementedInterfaceNames(i1);
                    break;

                case 6:
                    DoubleStack d2 = new DoubleStack(5);
                    System.out.println("My superclass is: " +d2.getClass().getSuperclass().getName());
                    break;
                case 7:
                    IntStack s5 = new IntStack(6);
                    int[] arr1 = { 10, 20, 30, 40, 50 };
                    try {
                        s5.push(arr1);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    s5.printStack();
                    break;
                case 8:
                    DoubleStack d3 = new DoubleStack(6);
                    double[] arr2 = { 10.5, 20, 30, 40, 50 };
                    try {
                        d3.push(arr2);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    d3.printStack();
                    break;
                case 9:
                    Stack s6 = new IntStack(5);
                    System.out.println(s6.isEmpty());
                    System.out.println(s6.isFull());
                    System.out.println(s6.getSize());
                    break;
                case 10:
                    Stack d4 = new DoubleStack(5);
                    // I have created with super class reference
                    // assigned a sub class object.Here I would like to use push(arr3)
                    // function.So perform downcasting here.After that call printStack method
                    double[] arr3 = { 1.2, 2.2, 3.2 };
                   (( DoubleStack)d4).push(arr3); // down casting - by casting super class object to subcalss type
                   (( DoubleStack)d4).printStack();
                    break;

            }
        }

        sc.close();
    }
}
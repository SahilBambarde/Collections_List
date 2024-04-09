import java.util.Stack;

public class StackDemo {
    /*
    * LIFO
    * Allows Duplicate elements
    * Insertion Order is preserved
    * Accepts Heterogeneous objects
    * */

    public static void main(String[] args){
        Stack s = new Stack();

        s.push(10);

        s.push(30);

        s.push(true);

        Object o = s.pop();
        //removes element at the top of the stack

        System.out.println(s);
        //[10, 30]

        Object o1 =s.peek();
        System.out.println(o1);
        //30

        System.out.println(s);
//        [10, 30]


        System.out.println(s.isEmpty());
        //false

        System.out.println(s.search(10));
        //2



    }
}

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
    /*
    LinkList
    Allows Duplicate elements
    Heterogeneous Objects are allowed
    Insertion Order is preserved
    null insertion is possible
    */

    public static void main(String[] args){
        LinkedList l = new LinkedList();

        //Collection Collection;
        //LinkedList ll = new LinkedList(Collection c);
        //we can pass arraylist or set

        //Methods
        l.add("John");
        l.add(10);
        l.add(null);
        System.out.println(l);
        //[John, 10, null]

        l.set(1,13); //this method can replace an element
        System.out.println(l);
        //[John, 13, null]

        l.add(2,true);
        //this adds the value and shift the previous value by one place
        System.out.println(l);
        //[John, 13, true, null]

        l.removeLast();
        System.out.println(l);
        //[John, 13, true]

        l.addFirst(1);
        //this adds the value and shift the previous value by one place
        System.out.println(l);
        //[1, John, 13, true]


    }
}

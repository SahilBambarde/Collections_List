import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        /*
        * Allows Duplicate elements
        * Insertion Order is preserved
        * Accepts heterogeneous objects
        * CloneAble
        * RandomAccess
        * Thread-safe
        * */

        Vector v = new Vector();
        //initial size of a vector is 10.
        //after this if will increate the size to double

        Vector vec = new Vector(60);

        Vector vec1 = new Vector(100,5);


        //Vector vec2 = new Vector(Collection c);
        //Collection can any type

        v.add(10);
        v.addElement("Hello");
        System.out.println(v);
        //[10, Hello]

        v.remove(0);
        System.out.println(v);
        //[Hello]

        System.out.println(v.elementAt(0));
        //Hello

        System.out.println(v.firstElement());
        //Hello
        System.out.println(v.lastElement());
        //Hello

        System.out.println(v.get(0));
        //Hello

        System.out.println(v.size());
        //1

        System.out.println(v.capacity());
        //10


    }
}

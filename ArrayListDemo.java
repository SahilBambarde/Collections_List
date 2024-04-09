import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] arg){
        ArrayList al = new ArrayList();

        List al1 = new ArrayList();

        ArrayList aList = new ArrayList(30);

        //Default size is 10

        //increment is (x * 1.5) + 1

        //ArrayList alist1 = new ArrayList(Collection c);

        al.add("JOhn");
        al.add(true);
        al.add(10);

        System.out.println(al);
        //[JOhn, true, 10]

        al.remove(1);
        System.out.println(al);
        //[JOhn, 10]

        al.remove("JOhn");
        System.out.println(al);
        //[10]

        System.out.println(al.get(0));
        //10

        ArrayList<String> strList = new ArrayList<>();

        /*
        * ArrayList is serializable
        * ArrayList is Cloneable
        * RandomAccess Interface (Marker Interface) -> Random elements can be accessed at the same time
        * */
    }
}

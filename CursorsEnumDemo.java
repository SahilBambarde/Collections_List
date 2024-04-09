import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class CursorsEnumDemo {
    /*
    * Cursors
    * An Indicator used to show the current position for respective object or element
    *
    * Four Types of Cursors
    * Enumeration
    * Iterator
    * ListIterator
    * Spliterator
    * */

    public static void main(String[] ar){
        Vector v = new Vector();

        for(int i=0;i<=8;i++){
            System.out.println("Enter the elements : ");
            Scanner s = new Scanner(System.in);
            Integer data = s. nextInt();
            v.add(data);
        }

        System.out.println(v);


        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            Integer element = (Integer) e.nextElement();
            if(element %3==0){
                System.out.println(element);
            }
        }



    }

}

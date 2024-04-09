import java.util.ArrayList;
import java.util.Iterator;

public class CursorsItrDemo {
    public static void main(String[] args){
        ArrayList<Integer> data = new ArrayList<>();

        data.add(12);
        data.add(23);
        data.add(36);

        Iterator itr = data.iterator();

        while(itr.hasNext()){
            Integer i = (Integer) itr.next();

            if(i%3==0){
                System.out.println(i);
                //12
                //36
            }else{
                itr.remove();
            }
        }

        System.out.println(data);
        //[12, 36]

    }
}

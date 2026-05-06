import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class arraylistop {
    public static void main(String args[]){
        // int a[]=new int[5];
        // a[0]=1;
        // a[1]=2;
        // System.out.println(Arrays.toString(a));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(10);
        System.out.println(a);

        //set
        a.set(2, 3);
        a.set(3, 50);
        System.out.println(a);

        //remove
        a.remove(1);
        System.out.println(a);

        //contains
        boolean b= a.contains(3);
        System.out.println(b);
        //System.out.println(a.contains(50));

        //sorting
        Collections.sort(a);
        System.out.println(a);

        //for string data type
        // ArrayList<String> a = new ArrayList<>();
        // a.add("5");
        // a.add("6");
        // a.add("7");
        // a.add("10");
        // System.out.println(a);


        // a.set(2, "3");
        // a.set(3, "50");
        // System.out.println(a);


        // a.remove(1);
        // a.remove(0);
        // System.out.println(a);

    }
}

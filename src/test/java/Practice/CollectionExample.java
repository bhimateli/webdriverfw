package Practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionExample {

    public static void main(String [] args){

        Set s = new HashSet();

        s.add("hello");
        s.add('l');
        s.add(3);
        s.add(null);
        s.add(null);
        System.out.println(s);

        List l = new LinkedList();

        l.add("Bhima");
        l.add(1);
        l.add('g');



        System.out.println(l);

    }
}

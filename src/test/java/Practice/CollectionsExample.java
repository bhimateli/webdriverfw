package Practice;

import kotlin.collections.ArrayDeque;
import org.databene.commons.collection.MapEntry;

import java.util.*;

public class CollectionsExample {

    public static void listExample(){

        List arrayList = new ArrayList<>();
        List linkedList = new LinkedList();

        //Linkedlis adding values
        linkedList.add("Bhimashanakr");
        linkedList.add(20);
        linkedList.add(true);

       //Arraylist adding values.
        arrayList.add("Bhimashanakr");
        arrayList.add("Apple");
        arrayList.add(45);

        for(Object obj :arrayList){

            System.out.println("ArraysList objects: "+ obj);
        }
        System.out.println("\n");
        for(Object obj : linkedList){
            System.out.println("LinkedList objects: "+ obj);
        }
        Collections.reverse(arrayList);
        Collections.reverse(linkedList);
        System.out.println("The arraylist is "+arrayList);
        System.out.println("The linkedList is "+linkedList);

        Integer arry [] = {1,2,3};
        List<Integer> list = new ArrayList(Arrays.asList(arry));

        System.out.println("Converted Array to Arraylist is "+list);

        String[] array = {"Apple", "Banana", "Cherry"};

        // Convert array to ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList: " + arrayList1);

        Iterator it = arrayList1.iterator();

        while(it.hasNext()){
            System.out.println("Print using iterator "+it.next());
        }
    }

    public void setExample(){


    }

    public static  void mapExample(){

        HashMap<String, String> map = new HashMap();
        map.put("Teli", "Bhimashankar");
        map.put("Biradar", "Rahul");

        for(Object s :map.keySet()){
            System.out.println("Map keys are "+ s);
        }

        for (Object s : map.values()){
            System.out.println("Map values are "+s);
        }

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println("Map values are using Map.Entry "+entry.getValue());
            System.out.println("Map values are using Map.Entry "+entry.getKey());

        }
    }

    public static void main(String []args){

        CollectionsExample.listExample();
        CollectionsExample.mapExample();
    }
}

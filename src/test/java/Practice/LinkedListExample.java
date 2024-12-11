package Practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    static List<String> list = new LinkedList<>();
    // read values and print it.
    // understand the concepts of the linkedlist and its methods.
    
    public static void addValues(){


        list.add("Apple");
        list.add("Mangoes");
        list.add("Banana");
        }
    public static void lisOfList(){
        List<List<String>> listOfList = new LinkedList<>();

        List list2 = new LinkedList();
        List list3 = new LinkedList();

        list2.add("Bhima");
        list2.add("Teli");
        listOfList.add(list2);

        list3.add("Computer");
        list3.add("Arts");

        listOfList.add(list3);

        for(List<String> list: listOfList){

                System.out.println(list);

        }

    }
    public static void display(){
        for(int i=0;i<list.size();i++){
            System.out.println("The values are -->"+list.get(i));
        }
    }
        public static void main(String []args){

      //  LinkedListExample.addValues();
       // LinkedListExample.display();
        LinkedListExample.lisOfList();;
    }

}

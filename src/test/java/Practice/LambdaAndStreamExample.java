package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndStreamExample {

    public static void listExample(){
        List<String> list = new ArrayList<>();
        list.add("Bhima");
        list.add("Teli");
// lambda expression
        list.forEach(name->System.out.println(name));
    }

    public static void evenNumber(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // [2, 4]
    }
    public static void main(String []args){

        LambdaAndStreamExample.listExample();
        LambdaAndStreamExample.evenNumber();
    }
}

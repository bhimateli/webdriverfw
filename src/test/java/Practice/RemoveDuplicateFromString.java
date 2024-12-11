package Practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

    public static void removeDuplicate(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            set.add(ch);


        }
        StringBuilder result = new StringBuilder();

        for(char ch : set){
            result.append(ch);
        }
        System.out.println(result);
    }

    public static void main(String[]args){

        String str = "Bhimashanakr Teli";
        String str1 = "abaa";
        String str3 = "Ball";

    RemoveDuplicateFromString.removeDuplicate(str1);
    }
}

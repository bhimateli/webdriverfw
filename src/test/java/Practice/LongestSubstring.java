package Practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public void subStringlenth() {

        String str = "greek";
        Set<Character> set ;

        int count=0;
        int count1=0;

        for (int i = 0; i <= str.length() - 1; i++) {
            set = new HashSet<>();

            count=0;

            for (int j = i+1; j < str.length() ; j++) {

                if (str.charAt(i) != str.charAt(j) && !set.contains(str.charAt(j))) {
                    set.add(str.charAt(j));
                  count++;
                }else break;

            }
            if(count > count1)
                count1 = count +1;
           }
       System.out.println("Count of the substring ->"+ count1);
        }

        public static void main(String []args){
            LongestSubstring obj = new LongestSubstring();
            obj.subStringlenth();

        }
    }


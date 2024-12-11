package Practice;

import java.util.ArrayList;
import java.util.List;

public class FindNumberofElementsForSum {


    public static  void forArrayOfElements(int target){


        List<int[]> list = new ArrayList<>();


        for (int i=0;i<=target;i++){

            for(int j=0;j<=target;j++){

                int k = target - i - j;

                if (k >= 0 && k <= target) { // Ensure valid values
                    list.add(new int[]{i, j, k});
                }
            }

        }
        for (int[] arr : list) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
            System.out.println("]");
        }
    }

    public static void main(String []args){

        FindNumberofElementsForSum.forArrayOfElements(6);
    }
}

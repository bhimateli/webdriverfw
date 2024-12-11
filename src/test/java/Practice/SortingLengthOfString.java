package Practice;

public class SortingLengthOfString {


    public static void main(String[] args) {

        String[] strings = {"apple", "banana", "kiwi", "grape", "pineapple", "fig"};

        // Sort the array by length (Bubble Sort)
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    // Swap strings[j] and strings[j+1]
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
            System.out.println("Sorted strings by length (ascending):");
            for (String str : strings) {
                System.out.println(str);
            }

            // To sort in descending order, modify the comparison condition
            for (int i = 0; i < strings.length - 1; i++) {
                for (int j = 0; j < strings.length - i - 1; j++) {
                    if (strings[j].length() < strings[j + 1].length()) {
                        // Swap strings[j] and strings[j+1]
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                    }
                }
            }

            // Print sorted array (descending order by length)
            System.out.println("Sorted strings by length (descending):");
            for (String str : strings) {
                System.out.println(str);
            }
        }

}

package Practice;

public class RevereseWord {

    public void reverseWord(){
        String rev = "";
        String str = "This is a tree";

        String []  split = str.split(" ");

        for (int i=0;i<split.length;i++){

          String temp = split[i];
          for(int j=temp.length()-1;j>=0;j--){
              rev = rev + temp.charAt(j);

          }rev = rev + "%";

        }
        System.out.println("The reverse of the string in the word "+rev);
    }
    public static void main(String args[]){
        RevereseWord obj = new RevereseWord();
        obj.reverseWord();


    }
}

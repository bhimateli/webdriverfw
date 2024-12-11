package Practice;

public class StarPrint {

    // Right angled triangle

    public static void main(String[]args){

        StarPrint st = new StarPrint();
        //st.invertedAngledTriangle(5);
       // st.rightAngledTriangle(5);
        st.pyramid(5);
    }

    public void invertedAngledTriangle(int n){
        for(int i=0; i<n;i++){

            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void rightAngledTriangle(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

    // print pyramid
    public void pyramid(int n){
   // top part
        for(int i=1;i<=n;i++){

            //print space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<= i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // below part

        for(int i=n;i>=1;i--){

            //give space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

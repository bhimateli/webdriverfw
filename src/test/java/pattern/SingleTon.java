package pattern;

public class SingleTon {

   static private volatile  SingleTon instance;

    private SingleTon(){
    System.out.println();
    }

    public static  SingleTon getInstance() {


        if (instance == null) {
            synchronized (SingleTon.class) {
                instance = new SingleTon();
            }

        }return instance;
    }

    public void display(){
        System.out.println("The method from singleTone class");
    }

    public static void main(String [] args){
        SingleTon obj = SingleTon.getInstance();
        obj.display();
    }
}

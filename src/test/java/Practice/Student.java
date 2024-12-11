package Practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    int age;
    int rollNo;

    public Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }


    public static void main(String []args){

        List<Student> list = new ArrayList<Student>();

        list.add((new Student("Bhima",12,345)));
        list.add(new Student("Avinash", 10, 11));
        for(Student st : list){
            System.out.println("The name of the student is->"+st.name + "  Age of the student is "+st.age);
        }
        Collections.sort(list);
        for(Student st : list){
            System.out.println("The name of the student is->"+st.name + "  Age of the student is "+st.age);
        }

    }

    @Override
    public int compareTo( Student st) {

        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }


}

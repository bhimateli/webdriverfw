package Practice;

import java.sql.*;
import java.util.*;

public class ComparatorExample {


    public void dbConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.sql.jdbc.Driver");

        Connection con = DriverManager.getConnection("url", "user", "pasword");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("query");

        while(rs.next()){

        }
    }
    public static void main(String[]args){

        List<Employee> list  = new ArrayList<Employee>();

        list.add(new Employee("Bharat", 11));
        list.add(new Employee("Arati", 12));

        // sorting using name
        Collections.sort(list, new EmployeeNameComparator());

        for(Employee ep: list){
            System.out.println("After sorting by name of the employee "+ ep.name + "\n after sorting "+ep.empId );
        }

        Collections.sort(list, new EmployeeIDComprator());

        for(Employee ep: list){
            System.out.println("After sorting by name of the employee "+ ep.name + "\n after sorting "+ep.empId );
        }
    }

}

class Employee{

    String name;
    int empId;

    public Employee(String name, int empId){
       this.empId = empId;
       this.name = name;
    }

}

class EmployeeIDComprator implements Comparator<Employee>{

    @Override
    public int compare(Employee s1, Employee s2) {
        if(s1.empId==s2.empId)
            return 0;
        else if(s1.empId>s2.empId)
            return 1;
        else
            return -1;
    }
}

class EmployeeNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.name.compareTo(o2.name));
    }
}
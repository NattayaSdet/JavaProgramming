package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name){ // in case I want to set only name so my constructor has only name parameter
        this.name = name;
    }

    public Employee(String name, char gender){
        this(name); //used instead of this.name = name;  // calls name const, must be in first step only
        this.gender = gender;

    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
        //this(name, gender);  // const call must be in the 1st step only // can call only onc const
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }


    /*
    public void method1(){  //only a constructor can call another constructor
        this("Aaron");
    }
*/

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */

}

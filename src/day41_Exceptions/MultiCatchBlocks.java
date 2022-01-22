package day41_Exceptions;

import day39_recap.Cydeo.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {


      Employee employee = null;

      try{
          System.out.println(employee.getSalary());  //Null pointer exception

      } catch (ArithmeticException e){
          System.out.println("Second catch block");
          e.printStackTrace();

      }catch (ClassCastException e){
          System.out.println("Third catch block");
          e.printStackTrace();

      }catch (RuntimeException e){
          System.out.println("Fourth catch block");
          e.printStackTrace();
      }


        System.out.println("Tested Completed");

    }


}

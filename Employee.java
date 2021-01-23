package slaray;
import java.util.*;
class Employee{
  private int salary;
  public Employee(int salary)
  {
    this.salary=salary;
  }
  int getSalary()
  {
    return salary;
  }
  public static void main(String[]args)
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the salary given to manager and labour");
    int msalary=sc.nextInt();
    int lsalary=sc.nextInt();
    System.out.println("enter the inceptive and overtime given to manager and labour");
    int inceptive=sc.nextInt();
    int overtime=sc.nextInt();
    Manager m=new Manager(msalary,inceptive);
    labour l=new labour(lsalary,overtime);
    System.out.println("Manager Salary"+" "+m.getSalary());
    System.out.println("labour Salary"+" "+l.getSalary());
  }
}

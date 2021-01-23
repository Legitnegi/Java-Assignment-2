package slaray;
class Manager extends Employee{
  private int inceptive;
  Manager(int sal,int inceptive)
  {
    super(sal);
    this.inceptive=inceptive;
  }
  int getSalary()
  {
    return(super.getSalary()+inceptive);
  }

}

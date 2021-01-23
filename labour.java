package slaray;
class labour extends Employee{
  private int overtime;
  labour(int sal,int overtime)
  {
    super(sal);
    this.overtime=overtime;
  }
  int getSalary()
  {
    return(super.getSalary()+overtime);
  }

}

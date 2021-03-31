package a2assignments;

/*
 * Test the following principles of an abstract class:

	• If any class has any of its method abstract then you must declare entire class abstract.

	• Abstract class cannot be instantiated.

	• When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

	• Abstract class cannot be private.

	• Abstract class cannot be final.

	• You can declare a class abstract without having any abstract method.

	Description:-
	* Write a program in such a way that all the conditions above for abstract class should satisfy.
 */

abstract class AbstractCheck{
	public int variableOne = 2;
	public String str = "Hello";
	public void CompletedMethod() {
		int values = 100;
		System.out.println(values);
	}
	public abstract void inCompleteMethod();
	public abstract int inCompleteMethod2();
}

//abstract Method without anything inside
abstract class Abstract2{}

//implementing -> When we extend an abstract class,
//we must either override all the abstract methods in sub class or declare subclass as abstract.
abstract class CheckExample extends AbstractCheck{}  //we are not implementing the above unimplemented methods so,
                                                    //we have to declare this class too abstract
public class Assignment2Q4 extends AbstractCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inCompleteMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public int inCompleteMethod2() {
		// TODO Auto-generated method stub
		return 0;
	}

}


public abstract class Calculator {
	
	final int a=10;
	
	final float calculate (int a , int b)//float method
	//when creating final method it will allow u to change anything only here in this class file and in this code. 
	{
		System.out.println("Inside Calculator.calculate()/*we wrote calculate() to mean calculate method*/");
		int  c = a+b;
		return c;
	}
	
	
	abstract boolean login(String UserID, String password);//login method is a abstract method 
	//this has no body so this can't be called, because there's no body 
	
//	boolean login(String UserID, String password)
//	{
//		if(UserID.equals("user") && password.equals("password"))
//			//or u can write the above if condition code from line 13 - 20 like below:
//			//return UserID.equals("user") && password.equals("password"); 
//		{ 
//			return true;
//		}
//		else 
//		{
//			return false;
//		}
//		
//	}

	public static void main (String args[])//main method
	{
//		Calculator calc = new Calculator();
// 		calc.calculate();
//	System.out.println(c);
	}
	 
}
/*
 -to avoid the default implementation of a method we need to override that in the subclass.
 
//abstract method doesn't contain any body or methods with no body.
//if we are using abstract method then the class also should be abstract only
//abstract class: a class which is defined with abstract key word.
//abstract methods should be in abstract class only.
//abstract classes can contain 0 to n number of abstract methods and also non abstract methods also.
//what happens when we call an abstract method without body?
//answer: compiler will avoid all the ways of calling the abstract method.
//if its a static we use class name for calling the method
//if its a non static we use object for calling the method.
//if we are not provide method body in super class, then we can provide abstract method body in the sub class.

//if we have to use multiple inheritance then we have to use interfaces.
//interfaces will have abstract methods .
//instead of class we give interface while creating interface file.
example:
	public interface MyInterface
	{
	
	}
	

//if it is supporting static and object creation functionalities by using the object we call the other methods.
there's no non abstract methods in "interface", if u have to use the structure u have to implement it and,
to implement it we have to create another subclass and add the structures here

*/









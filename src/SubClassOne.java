//modifying super class is not encouraged when we are having multiple sub classes.
public class SubClassOne extends Calculator 

{
	
	public static void main(String args[])
	{
//		SubClassOne one = new SubClassOne();//creating object 
////		float result = one.calculate(10,20);//calling calculate method from the super class 
////		System.out.println("Result:" + result);
//		float  result = one.calculate(10, 20, 30);
//		System.out.println("Result:" + result);
//	
	}
	//refractor is for renaming 
//	@Override //whatever starts with @ its called "annotations"
//	float calculate(int a, int b)//writing calculate method with same method signature this is now there in both super class and sub class
//	{
//		return a*b;
//	}
//	
	//int a =10;
	//float b = 20;
	//we can't store value of b in a 
	//we can store value of a in b, because the float value is bigger than int value.
	
	//SubClassOne sOne = null;
	//Calculator calc = null;
	
	//calc = sOne;//we can store sub class object in the super class reference(child can act as a parent)
	//sOne = calc;//we can't store parent object with in the child object.(parent can't take child properties)
	
	
	float calculate (int a, int b, int c) 
	{
		return a * b * c;
	}
	
	
	@Override//forcefully we are overriding the login method here
	boolean login(String UserID, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}

/*
 -we need to check what we have ourself in the child class first,
  then we need to go to parent method.
  
  -we should'nt change the code in the super class.
  
 -when we don't want to change the super class code then,
  we need to use method overriding and write a separate code inside the subclass which is called method overriding.
 
 -writing a method with the same signature in both super class,
  and sub class is called as method @overriding. 
 
 -writing a method with the different signature,
  but giving the same method name, this method is called @overloading.
 
 -we are creating sub structures,
  and we are expecting to execute them forcefully
*/
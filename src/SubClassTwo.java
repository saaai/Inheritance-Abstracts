 
public class SubClassTwo implements MyInterface
{

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float calculate() 
	{
		// TODO Auto-generated method stub
		//MyInterface.a; you can't call this here because this is a static variable
		return 0;
	}

	public static void main(String args[])
	{
		System.out.println(MyInterface.a);
		//MyInterface.a =100;
	}
	
}

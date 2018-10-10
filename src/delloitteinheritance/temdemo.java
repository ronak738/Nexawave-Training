package delloitteinheritance;

public class temdemo {
	
	public static void main(String[] args)
	{
		tem obj=new tem();
		obj.setprice(-10);
		m1();
		System.out.println("successfully executed");
		
		
	}
	
	public static void m1()
	{
		System.out.println("start of m1");
		m2();
		System.out.println("end of m1");
	}

	public static void m2()
	{
		int i;
		System.out.println("start of m2");
		try
		{
		i= Integer.parseInt("123m");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("please handle");
		}
		System.out.println("handled");
		System.out.println("end of m2");
	}
	
}

package delloitteinheritance;

public class tem {

	
	public void setprice(int price)throws IllegalArgumentException
	{
		
		try
		{
			if(price>0)
				System.out.println("good");
			else
				throw new IllegalArgumentException("invalid price");
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.println("exception handled\n");
		}
		
		System.out.println("pppp");
		
		
	}

}

package learningcorejava;


public class reversenumber {

	public static void main(String[] args)
	{
	int i=567;
	int s=0,d=0;
	while(i>0)
	{
		d=i%10;
		s=s*10+d;
		i=i/10;
	}
	
	System.out.print(s);
	}

}

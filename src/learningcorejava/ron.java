package learningcorejava;



public class ron {

	public static void main(String[] args)
	{
	int i=13257,s=0;
	while(i>0)
	{
		int d=i%10;
		if(d%2==0){
		s=s+d;
		}
		i=i/10;
	}
	
	System.out.print(s);
	}

}

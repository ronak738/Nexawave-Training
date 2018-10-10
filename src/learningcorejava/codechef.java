package learningcorejava;

public class codechef {
	
	public static void main(String[] args) {
		
		printline(50,60);
	}
	
	public static void printline(int j)
	{
		for(int i=0;i<100;i++)
			System.out.println(j);
	}
	
	public static void printline(int length,char c)
	{
		for(int i=0;i<length;i++)
			System.out.println(c+" "+i);;
			
	}
	public static int printline(int x,int y)
	{
		
		//apple
		//mango
		
			if(x>y)
				return x;
			else
				return y;
	}
		

}


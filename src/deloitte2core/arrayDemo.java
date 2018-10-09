package deloitte2core;

public class arrayDemo {
	public static void main(String[] args) {
		
		
		int[][] a;
		a=new int[4][];
		a[0]=new int[2];
		a[1]=new int[4];
		a[2]=new int[3];
		a[3]=new int[1];
		
		

		
		
		a[0][0]=12;
		a[0][1]=15;
		a[1][0]=16;
		a[1][1]=20;
		a[1][2]=36;
		a[1][3]=84;
		a[2][0]=37;
		a[2][1]=21;
		a[2][2]=22;
		a[3][0]=16;
		
	
		System.out.println(a[0][0]+ " "+a[0][1]+"\n"+a[1][0]+" "+a[1][1]+" "+a[1][2]+" "+a[1][3]+"\n"+a[2][0]+" "+a[2][1]+" "+a[2][2]+"\n"+a[3][0]);
		
		int[][] b={{12,15},{16,20,36,84},{37,21,22},{16}};
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();	
		}
		}
		
	
	
	
	public static void main1(String[] args) {
		int[] a= {4,2,3,1,778,23,90,-123};
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		
		
		System.out.println(" ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i]<a[j])
						{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						 }
				
			}
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		

		
		}
	}





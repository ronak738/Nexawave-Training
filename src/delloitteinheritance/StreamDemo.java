package delloitteinheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class StreamDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in=null;
		FileOutputStream out=null;
		try{
		
		in=new FileInputStream("C:\\Users\\admin\\workspace\\raunak\\learningcorejava\\src\\rakhi.java");
		out= new FileOutputStream("C:\\Users\\admin\\workspace\\raunak\\learningcorejava\\src\\rakhi1.java");
	//	FileInputStream in=new FileInputStream("C:\\Users\\admin\\my.txt");
		

		int t;
		
		while((t=in.read())!=-1)
		{
			System.out.print((char)t);
			out.write(t);
		}
		
		
		} 
		
		
	catch(FileNotFoundException fnfe)
		{
		fnfe.printStackTrace();
		}
		
		catch(IOException fnfe)
		{
			fnfe.printStackTrace();
		}
		
		
		finally{
			if(in!=null)
			{
				try
				{
					
	
			in.close();
			
				}
				catch(IOException e){}
			
		}
			if(Objects.nonNull(out))
			{
				try
				{
					out.close();
				}
				catch(IOException e){}
			}
		}
	}
}
		
	
			

	


package delloitteinheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class CharStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
		
		try
		{
			in=new FileReader("C:\\Users\\admin\\workspace\\raunak\\learningcorejava\\src\\rakhi.java");
			
		//	FileInputStream in=new FileInputStream("C:\\Users\\admin\\my.txt");
			

			int t;
			
			while((t=in.read())!=-1)
			{
				System.out.print((char)t);
				
			}
			
			
		}
				catch(IOException ioe)
		{
					ioe.printStackTrace();
		}
		
	
		finally
		{
			if(Objects.nonNull(in))
			{
				try
				{
					in.close();
				}
				catch(IOException ioe){}
			}
		}

	}

}

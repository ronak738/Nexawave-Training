package delloitteinheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream in=new FileInputStream("C:\\Users\\admin\\workspace\\raunak\\learningcorejava\\src\\rakhi.java");
	//	FileInputStream in=new FileInputStream("C:\\Users\\admin\\my.txt");
		int t;
		
		while((t=in.read())!=-1)
		{
			System.out.print((char)t);
		}
			

	}

}

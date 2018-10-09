package coreapi;

public class Stringdemo {
	public static void main(String[] args) {    
		
		String s1="Java programming language";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(9));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1=s1+"ronak";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(s1.substring(10));
		System.out.println(s1.substring(2, 10));
		System.out.println(s1.subSequence(2, 10));
		String s2="ronak";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("java"));
		
	}
		// TODO Auto-generated method stub

	

}

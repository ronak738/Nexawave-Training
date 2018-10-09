package delloitteinheritance;

public abstract class Animal{

	boolean alive;
	{
		alive=true;
	
	}
	
	
	public void eat()
	{
		System.out.println("Animal is eating");
		
	}
	
	
	public abstract void move(int distance);
/*	
	{
		System.out.println("animal is moving"+ " "+ distance+"distances");
	}*/
	
	/*public static void main(String[] args) {
		Animal a1=new Animal();
		System.out.println(a1.alive);
		a1.eat();
	
		a1.move(100);
		// TODO Auto-generated method stub

	}*/

}

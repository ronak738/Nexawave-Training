package delloitteinheritance;

public class Cat extends Animal implements hunter1,Jumper,Runner
{
	
	public void hunt()
	{
		System.out.println("cat is hunting");
	}

	
	public void jump(int length)
	{
		System.out.println("cat jump  "+length+"  distance");
	}
	
	
	
	@Override
	public void move(int distance) {
		System.out.println("cat is moving  "+distance+"  distance");
		// TODO Auto-generated method stub
		
	}


	public void run(int distance)
	{
		
		System.out.println("cat running  ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.run(300);
		c.jump(400);
		c.move(500);
		c.hunt();
		

	}

}

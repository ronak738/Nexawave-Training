package delloitteinheritance;

public class Bird extends Animal{
	public void fly()
	{
		System.out.println("fly");
		
	}

	
	public void move(int distance)
	{
		System.out.println("birds is moving" +" "+ distance);
	}
	
	public static void main(String[] args) {
		
	//	Animal a1=new Animal();
		Bird b1=new Bird();
		//System.out.println(a1.alive);
		//a1.eat();
	
		//a1.move(100);
		Animal a2=new Bird();
		//
		System.out.println(this.move);
		
		//a2.fly();		
		
Bird b2=(Bird)a2;



Bird b3=new Bird();
b3.move(100);
//b3.move(1000L);


	}

	}



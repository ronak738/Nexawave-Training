package delloitteinheritance;

public class Engine {
private String brand;
private String type;
private double hp;

public Engine()
{
	brand="ford";
	type="diesel";
	hp=28.5;
}
public Engine(String brand,String type,double hp)
{
	this.brand="ford";
	this.type="diesel";
	this.hp=28.5;
}


	public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getHp() {
	return hp;
}
public void setHp(double hp) {
	this.hp = hp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

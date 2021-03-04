package Week03;


public class Animal {

	private String color = "";
	private int legs;
	
	
	public Animal(String color, int legs) {
		super();
		this.color = color;
		this.legs = legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public String toString() {
		return "Animal: Color= "+getColor() + ", Legs=  " +getLegs() ;
	}
	
}

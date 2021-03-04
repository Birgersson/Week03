package Week03;

public class Bird extends Animal {
	
	private String feathers = "";
	private boolean eatFish;
	
	public Bird(String color, int legs) {
		super(color, legs);
	}
	
	public Bird(String color, int legs, String feathers, boolean eatFish) {
		super(color, legs);
		this.feathers = feathers;
		this.eatFish = eatFish;
	}
	public String getFeathers() {
		return feathers;
	}
	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	public boolean isEatFish() {
		return eatFish;
	}
	public void setEatFish(boolean eatFish) {
		this.eatFish = eatFish;
	}
	
	public String toString() {
		return "Bird: Color= "+getColor() + ", Legs=  " +getLegs() + 
				" Feathers= " +getFeathers() + "Eats fish= " +isEatFish();
	}

}

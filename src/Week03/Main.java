package Week03;


public class Main {

	public static void main(String[] args) {
		Bird bird1 = new Bird ("Blue", 2, "many and short", false);
		System.out.println(bird1.toString());

		Bird bird2 = new Bird ("Red", 3);
		System.out.println(bird2.toString());
		
		Animal a1 = new Animal ("Striped", 4);
		System.out.println(a1.toString());

	}

}

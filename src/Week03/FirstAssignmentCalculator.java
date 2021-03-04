package Week03;


public class FirstAssignmentCalculator { //Overloaded calc. MEtoderna heter lika men har olika signaturer
	
	public int addition (int firstValue, int secondValue) {
		return firstValue + secondValue; 
	}
	public double addition (double firstValue, double secondValue) {
		return firstValue + secondValue; 
	}
	public float addition (float firstValue, float secondValue) {
		return firstValue + secondValue; 
	}
	public long addition (long firstValue, long secondValue) {
		return firstValue + secondValue; 
	}
	public int subtraction (int firstValue, int secondValue) {
		return firstValue - secondValue; 
	}
	public double subtraction (double firstValue, double secondValue) {
		return firstValue - secondValue; 
	}
	public float subtraction (float firstValue, float secondValue) {
		return firstValue - secondValue; 
	}
	public long subtraction (long firstValue, long secondValue) {
		return firstValue - secondValue; 
	}

	
	public static void main(String[] args) {
		FirstAssignmentCalculator calc = new FirstAssignmentCalculator ();
		
		System.out.println("Addition: " +calc.addition(2, 3));
		System.out.println("Subtraction: "+calc.subtraction(2, 3));
		System.out.println("Addition: " +calc.addition(4E-300, 3E-300));
		System.out.println("Subtraction: "+calc.subtraction(4E-300, 3E-300));
		System.out.println("Addition: " +calc.addition(4E-10, 3E-10));
		System.out.println("Subtraction: "+calc.subtraction(4E-10, 3E-10));
		System.out.println("Addition: " +calc.addition(2.020202, 3));
		System.out.println("Subtraction: "+calc.subtraction(2.020202, 3));
		
	}
	
}

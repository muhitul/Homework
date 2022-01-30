package hw6Q2ifElseCondition;

public class Votar {

	public static void main(String[] args) {
		int age = 18;
		if (age ==18) {
			System.out.println("I am a Votar");
		}
		else if (age<18) {
			System.err.println("I am not a Votar");
		}
		else if (age>18) {
			System.out.println("I am a Votar");	
		}
		else {
			System.out.println("Please add a valid age ");
		}
		

	}

}

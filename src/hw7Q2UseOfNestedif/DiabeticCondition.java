package hw7Q2UseOfNestedif;

import java.util.Scanner;

public class DiabeticCondition {
	double hbga1c;
	public static void main(String[] args) {
		System.out.println("<--Please Enter your Hemoglobin A1C value below-->");
		Scanner scanner = new Scanner(System.in);
		double hbga1c = scanner.nextDouble();
		if (hbga1c > 6.4) {
			System.out.println("I am a  diabetic patient");
		} else if (hbga1c < 6.4) {
			System.out.println("Congratulation! you are not diabetic");
			if (hbga1c >=5.7);
			System.out.println("I am a  pre-diabetic.");
			if (hbga1c < 5.7);
			System.out.println("I am a  Healthy person.");
		}
	}
}

package hw4Q2JavaVariables;

public class aboutMeTest {
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Constructor is initialized,
		aboutMe.Name = "Muhitul Chowdhury";// variables initialized from this line
		aboutMe.age = 31;
		aboutMe.anualIncome = 50000;
		aboutMe.homeRent = 1500;
		aboutMe.height = 2.2f;
		aboutMe.grade = 3.29;
		aboutMe.sex = 'M';
		aboutMe.married = true;
		aboutMe.aboutMe();// method initialized
		System.out.println("\nManchester United Ex. Cauch info:\n");
		AboutMe alex = new AboutMe();// Constructor is initialized,
		alex.Name = "Sir Alex Ferguson";// variables initialized from this line
		alex.age = 81;
		alex.anualIncome = 100000;
		alex.homeRent = 3000;
		alex.height = 2.0f;
		alex.grade = 3.5;
		alex.sex = 'M';
		alex.married = true;
		alex.aboutMe();// method initialized
	}

}

package hw3Q2JavaVariable;

public class AboutMe {
	public String myName = "Muhitul Chowdhury";
	public byte myAge = 31;
	public int anualIncome = 50000;
	public short homeRent = 1500;
	public float height = 3.33f;
	public double grade = 3.29;
	public char sex = 'M';
	public boolean maried = true;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out
				.println("Name:" + aboutMe.myName + "\nAge:" + aboutMe.myAge + "\nGross Incom:" + aboutMe.anualIncome
						+"\nHouse Rent:"+ aboutMe.homeRent + "\nPersonal Info Below" +"\nHeght:"+aboutMe.height+"\nGrade:"+aboutMe.grade
						+ "\nSex:"+aboutMe.sex +"\nMarried:"+aboutMe.maried);
	}

}

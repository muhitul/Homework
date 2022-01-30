package hw4Q2JavaVariables;

public class AboutMe {
	public String Name;
	public byte age;
	public int anualIncome;
	public short homeRent;
	public float height;
	public double grade;
	public char sex;
	public boolean married;
	// variables declared here
	public AboutMe() {
		System.out.println("This is all about me:");
	}
	public void aboutMe() {
		System.out.println("Name:" + Name + "\nAge:" + age + "\nGross Incom:" + anualIncome + "\nHouse Rent:" + homeRent
				+ "\nPersonal Info Below" + "\nHeght:" + height + "\nGrade:" + grade + "\nSex:" + sex + "\nMarried:"
				+ married);
	}

}

package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public char grade;
	public int price;
	public boolean madeInUsa;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		System.out.println("Brand:" + brand + "\nModel:" + model + "\nOperatingSystem:" + operatingSystem + "\nPrice: "
				+ price + "$" + "\nGrade:" + grade + "\nMadeInUsa:" + madeInUsa);
	}

}

import java.util.*;

public class BodyMass {
	
	public static void main(String[] args) {
		double height, weight;
		double BMI;
		Scanner input = new Scanner(System.in);
		
		weight = input.nextDouble();
		height = input.nextDouble();
		input.close();
		
		BMI = (weight) / (height * height);
		
		if (BMI > 25) {
			System.out.println("Overweight");
		} else if (BMI >= 18.5 && BMI <= 25) {
			System.out.println("Normal weight");
		} else {
			System.out.println("Underweight");
		}
	}
}

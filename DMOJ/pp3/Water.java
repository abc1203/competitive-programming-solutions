import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int one = input.nextInt();
		int two = input.nextInt();
		int three = input.nextInt();
		
		if(one != two) {
			System.out.println(Math.abs(one - two));
		} else if(one != three) {
			System.out.println(Math.abs(one - three));
		} else {
			System.out.println(Math.abs(three - two));
		}
		
		input.close();
 	}
}

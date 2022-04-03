import java.util.*;

public class OccupyParking {
	public static void main(String[] args) {
		int N;
		int counter = 0;
		String A = new String();
		String B = new String();
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		A = input.next();
		B = input.next();
		input.close();
		
		for(int i = 0; i < N; i++) {
			if (A.charAt(i) == B.charAt(i) && A.charAt(i) == 'C') {
				counter++;
			}
		}
		
		System.out.println(counter);
	}
}

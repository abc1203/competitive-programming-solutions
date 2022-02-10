import java.util.*;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		int N;
		int countA = 0;
		int countB = 0;
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		
		String[] A = new String[N];
		String[] B = new String[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = input.next();
		}
		for (int i = 0; i < N; i++) {
			B[i] = input.next();
		}
		
		for (int i = 0; i < N; i++) {
			if (A[i].equals("rock")) {
				if (B[i].equals("scissors")) {
					countA ++;
				}
				if (B[i].equals("paper")) {
					countB ++;
				}
				
			}
			if (A[i].equals("paper")) {
				if (B[i].equals("rock")) {
					countA ++;
				}
				if (B[i].equals("scissors")) {
					countB ++;
				}
				
			}
			if (A[i].equals("scissors")) {
				if (B[i].equals("paper")) {
					countA ++;
				}
				if (B[i].equals("rock")) {
					countB ++;
				}
				
			}
					
		}
		
		input.close();
		
		System.out.println(countA + " " + countB);
		
	}

}

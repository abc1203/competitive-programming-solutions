import java.util.*;

public class RotatingLetters {
	
	public static void main(String[] args) {
		String A;
		char I = 'I';
		char O = 'O';
		char S = 'S';
		char H = 'H';
		char Z = 'Z';
		char X = 'X';
		char N = 'N';
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		A = input.next();
		
		input.close();
		
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == I || 
				A.charAt(i) == O ||
				A.charAt(i) == S ||
				A.charAt(i) == H ||
				A.charAt(i) == Z ||
				A.charAt(i) == X ||
				A.charAt(i) == N) {
				
				n ++;
			}
		}
		
		if (n == A.length()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}

import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n;
		int d1, d2, d3;
		String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
		String[][] A;
		int[][] B;
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		A = new String[n][4];
		B = new int[n][4];
		
		for(int i = 0; i < n; i++) {
			A[i][0] = input.next();
			A[i][1] = input.next();
			A[i][2] = input.next();
			A[i][3] = input.next();
		}
		
		input.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 12; j++) {
				if(A[i][0].equals(notes[j])) {
					B[i][0] = j;
				} else if(A[i][1].equals(notes[j])) {
					B[i][1] = j;
				} else if(A[i][2].equals(notes[j])) {
					B[i][2] = j;
				} else if(A[i][3].equals(notes[j])) {
					B[i][3] = j;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(B[i][1] < B[i][0]) {
				d1 = B[i][1] + 12 - B[i][0];
			} else {
				d1 = B[i][1] - B[i][0];
			}
			
			if(B[i][2] < B[i][1]) {
				d2 = B[i][2] + 12 - B[i][1];
			} else {
				d2 = B[i][2] - B[i][1];
			}
			
			if(B[i][3] < B[i][2]) {
				d3 = B[i][3] + 12 - B[i][2];
			} else {
				d3 = B[i][3] - B[i][2];
			}
			
			if(d1 == 4 && d2 == 3 && d3 == 3) {
				System.out.println("root");
			} else if(d1 == 3 && d2 == 3 && d3 == 2) {
				System.out.println("first");
			} else if(d1 == 3 && d2 == 2 && d3 == 4) {
				System.out.println("second");
			} else if(d1 == 2 && d2 == 4 && d3 == 3) {
				System.out.println("third");
			} else {
				System.out.println("invalid");
			}
		}
		
	}

}

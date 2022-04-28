import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int[] array = new int[T];
		
		for(int i = 0; i < T; i++) {
			int largestNum = -2147142347;
			int N = input.nextInt();
			
			for(int j = 0; j < N; j++) {
				int num = input.nextInt();
				
				if(num > largestNum) {
					largestNum = num;
				}
			}
			
			array[i] = largestNum;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		input.close();
	}
}

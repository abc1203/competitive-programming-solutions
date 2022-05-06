import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int L = input.nextInt();
		
		String[] array = new String[N];
		L = L % 26;
		
		input.nextLine();
		
		String s = input.nextLine();
		array = s.split(" ");
		
		for(int i = 0; i < array.length; i++) {
			String newWord = "";
			
			for(int j = 0; j < array[i].length(); j++) {
				int charPosition = array[i].charAt(j);
				
				charPosition += L;
				
				if(charPosition > 122) {
					charPosition -= 26;
				}
				
				newWord += (char)(charPosition);
			}
			
			array[i] = newWord;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		input.close();
	}
}

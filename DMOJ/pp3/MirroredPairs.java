import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		String word;
		
		word = input.nextLine();
		while(word.isBlank() == false) {
			boolean mirror = false;
			
			if(word.charAt(0) =='b') {
				if(word.charAt(1) =='d') {
					mirror = true;
				}
			} else if(word.charAt(0) =='d') {
				if(word.charAt(1) =='b') {
					mirror = true;
				}
			} else if(word.charAt(0) =='p') {
				if(word.charAt(1) =='q') {
					mirror = true;
				}
			} else if(word.charAt(0) =='q') {
				if(word.charAt(1) =='p') {
					mirror = true;
				}
			}
			
			list.add(mirror);
			
			word = input.nextLine();
		}
		
		System.out.println("Ready");
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == true) {
				System.out.println("Mirrored pair");
			} else {
				System.out.println("Ordinary pair");
			}
		}
		
		input.close();
	}
}

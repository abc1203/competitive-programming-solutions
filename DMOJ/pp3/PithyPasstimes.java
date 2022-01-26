import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			String hobby = input.next();
			
			if(hobby.length() <= 10) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		String[] direction = new String[10000000];
		int[] numOfSteps = new int[10000000];
		int index = 0;
		
		int num = readInt();
		
		while(num != 99999) {
			int remainingDigits = num % 1000;
			num /= 1000;
			
			int sum = 0;
			for(int i = 0; i < 2; i++) {
				sum += num % 10;
				num /= 10;
			}
			
			numOfSteps[index] = remainingDigits;
			if(sum == 0) {
				direction[index] = direction[index - 1];
			} else if(sum % 2 == 0) {
				direction[index] = "right";
			} else {
				direction[index] = "left";
			}
			
			index++;
			
			num = readInt();
		}
		
		for(int i = 0; i < index; i++) {
			System.out.println(direction[i] + " " + numOfSteps[i]);
		}
	}
	
	
	
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		
		return st.nextToken();
	}
	
	
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	
	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}
	
	
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	
	
	static char readCharacter() throws IOException {
		return next().charAt(0);
	}
	
	
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}

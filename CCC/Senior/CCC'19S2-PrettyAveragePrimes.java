import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	static boolean isPrime(int num) {
		if(num == 2) {
			return true;
		}
		if(num % 2 == 0) {
			return false;
		}
		
		for(int i = 3; i <= (int)Math.sqrt(num); i += 2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		int T = readInt();
		
		for(int i = 0; i < T; i++) {
			int num = readInt();
			
			for(int j = 2; j <= 2 * num; j++) {
				if(isPrime(j) && isPrime(2 * num - j)) {
					System.out.println(j + " " + (2 * num - j));
					break;
				}
			}
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

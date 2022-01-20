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
		int coins = readInt();
		int first = 35 - readInt();
		int second = 100 - readInt();
		int third = 10- readInt();
		int count = 1;
		int broke = 0;
		
		while(coins > 0) {
			coins --;
			
			if(count == 1) {
				first--;
				
				if(first == 0) {
					coins += 30;
					first = 35;
				}
				count++;
				
			} else if(count == 2) {
				second--;
				
				if(second == 0) {
					coins += 60;
					second = 100;
				}
				count++;
				
			} else {
				third--;
				
				if(third == 0) {
					coins += 9;
					third = 10;
				}
				count = 1;
			}
			
			broke++;
		}
		
		System.out.println("Martha plays " + broke + " times before going broke.");
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

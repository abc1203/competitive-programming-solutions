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
		int t = readInt();
		long[] list = new long[t];
		
		for(int i = 0; i < t; i++) {
			long k = readLong();
			long result;

			if(k % 10 == 0 || k % 10 == 1) {
				k += (2 - (k % 10));
			} else {
				k += (12 - (k % 10));
			}
			
			result = k * k * k;
			boolean found = false;
			
			while(!found) {
				if(result % 1000 == 888) {
					found = true;
				} else {
					k += 10;
					result = k * k * k;
				}
			}
			
			list[i] = k;
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(list[i]);
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

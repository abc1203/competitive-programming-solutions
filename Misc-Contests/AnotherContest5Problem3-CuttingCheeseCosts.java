import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		int N = readInt();
		int K = readInt();
		int costs[][] = new int[N][2];
		int dif[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			costs[i][0] = readInt();
			costs[i][1] = readInt();
			
			dif[i] = costs[i][0] - costs[i][1];
		}
		
		Arrays.sort(dif);
		
		long totalPrice  = 0;
		long savedAmount = 0;
		
		for(int i = 0; i < N; i++) {
			totalPrice += costs[i][0];
		}
		for(int i = N - 1; i > N - 1 - K; i--) {
			savedAmount += dif[i];
		}
		
		System.out.println(totalPrice - savedAmount);
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

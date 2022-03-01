import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	
	public static void main(String[] args) throws IOException {
		int N = readInt();
		int dp[] = new int[31];
		Arrays.fill(dp, 0);
		
		for(int i = 0; i < N; i++) {
			int a = readInt();
			int maxOccurence = 0;
			
			for(int j = 0; j <= 30; j++) {
				if((a >> j & 1) != 0) {
					if(dp[j] + 1 > maxOccurence) {
						maxOccurence = dp[j] + 1;
					}
				}
			}
			
			for(int j = 0; j <= 30; j++) {
				if((a >> j & 1) != 0) {
					dp[j] = maxOccurence;
				}
			}
		}
		
		int max = 0;
		for(int i = 0; i <= 30; i++) {
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		
		System.out.println(max);
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

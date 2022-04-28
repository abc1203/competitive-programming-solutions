import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		int N = readInt(); int W = readInt();
		int MV = (int)1e6; long dp[] = new long[MV + 1];
		int ans = 0;
		
		Arrays.fill(dp, (int)2e9);
		dp[0] = 0;
		
		for(int i = 0; i < N; ++i) {
			int weight = readInt(); int value = readInt();
			
			for(int j = MV; j >= value; --j) {
				dp[j] = Math.min(dp[j], dp[j - value] + weight);
			}
		}

		for(int i = 0; i <= MV; ++i) {
			if(dp[i] <= W) ans = Math.max(ans, i);
		}
		
		System.out.println(ans);
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

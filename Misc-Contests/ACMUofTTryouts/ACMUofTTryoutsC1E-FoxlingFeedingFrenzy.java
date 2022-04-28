import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	static int numberOfWays(int n, int k, int dp[][], int ranges[]) {
	    if(n < 0 || (k == 0 && n > 0)) {
	        return 0;
	    }
	
	    if((n == 0 && k > 0) || (n <= ranges[0] && k == 1)) {
	        return 1;
	    }
	
	    if(dp[n][k] != 0) {
	        return dp[n][k];
	    }
	
	    for(int i = 0; i <= ranges[k - 1]; i++) {
	        dp[n][k] += numberOfWays(n - i, k - 1, dp, ranges);
	    }
	    
	    return dp[n][k];
	}
	
	public static void main(String[] args) throws IOException {
		int T = readInt();
    	int[] ans = new int[T];

	    for(int i = 0; i < T; i++) {
	        int N = readInt(); int M = readInt();
			
			int[] ranges = new int[N];
	        
	        for(int j = 0; j < N; j++) {
	            int a = readInt();
	            int b = readInt();
	            
	            M -= a; b -= a;
	            
	            ranges[j] = b;
	        }
	        
	        if(M < 0) {
	        	ans[i] = 0;
	        } else {
	        	int[][] dp = new int[M + 1][N + 1];
	        	ans[i] = numberOfWays(M, N, dp, ranges);
	        }
	    }
	    
	    for(int i = 0; i < T; i++) {
	        System.out.println(ans[i]);
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

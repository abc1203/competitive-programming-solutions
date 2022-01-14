import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	static int N;
	static double dp[][][] = new double[301][301][301];
	
	static double solve(int numOfOne, int numOfTwo, int numOfThree) {
		if(numOfOne == 0 && numOfTwo == 0 && numOfThree == 0) return 0;
		if(dp[numOfOne][numOfTwo][numOfThree] > 0) return dp[numOfOne][numOfTwo][numOfThree];
		
		int numCases = numOfOne + numOfTwo + numOfThree;
		double totalPastTime = 0;
		
		if(numOfOne > 0) totalPastTime += numOfOne * solve(numOfOne - 1, numOfTwo, numOfThree);
		if(numOfTwo > 0) totalPastTime += numOfTwo * solve(numOfOne + 1, numOfTwo - 1, numOfThree);
		if(numOfThree > 0) totalPastTime += numOfThree * solve(numOfOne, numOfTwo + 1, numOfThree - 1);
		
		dp[numOfOne][numOfTwo][numOfThree] = (totalPastTime / numCases) + ((double)N / numCases);
		
		return dp[numOfOne][numOfTwo][numOfThree];
	}
	
	public static void main(String[] args) throws IOException {
		N = readInt(); 
		int numOfOne = 0; int numOfTwo = 0; int numOfThree = 0;
		
		for(int i = 1; i <= N; i++) {
			int num = readInt();
			if(num == 1) numOfOne++;
			if(num == 2) numOfTwo++;
			if(num == 3) numOfThree++;
		}
		
		System.out.println(solve(numOfOne, numOfTwo, numOfThree));
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

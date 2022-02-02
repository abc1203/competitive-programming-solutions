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
	
	
	public static void main(String[] args) throws IOException {
		int N = readInt();
		int[] measurements = new int[N];
		
		
		for(int i = 0; i < N; i++) {
			measurements[i] = readInt();
		}
		
		Arrays.sort(measurements);
		
		if(N % 2 == 1) {
			for(int i = 0; i < N/2; i++) {
				System.out.print(measurements[N/2 - i] + " ");
				System.out.print(measurements[N/2 + 1 + i] + " ");
			}
			System.out.print(measurements[0]);
		} else {
			for(int i = 0; i < N / 2; i++) {
				System.out.print(measurements[N/2 - 1 - i] + " ");
				System.out.print(measurements[N/2 + i] + " ");
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

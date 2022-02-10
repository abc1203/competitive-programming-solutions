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
		int n = readInt();
		int[] maxDistance = new int[n];
		
		for(int i = 0; i < n; i++) {
			int maxD = Integer.MIN_VALUE;
			int distance;
			int l = readInt();
			int[] array1 = new int[l];
			int[] array2 = new int[l];
			
			for(int j = 0; j < l; j++) {
				array1[j] = readInt();
			}
			
			for(int j = 0; j < l; j++) {
				array2[j] = readInt();
			}
			
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < l; k++) {
					if(k >= j && array2[k] >= array1[j]) {
						distance = k - j;
					} else {
						distance = 0;
					}
					
					if(distance > maxD) {
						maxD = distance;
					}
				}
			}
			
			maxDistance[i] = maxD;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("The maximum distance is " + maxDistance[i]);
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

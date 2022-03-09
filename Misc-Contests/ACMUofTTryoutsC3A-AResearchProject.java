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
		int G = readInt();
		int[][] list = new int[G][2];
		
		for(int i = 0; i < G; i++) {
			int N = readInt();
			int smallest = Integer.MAX_VALUE;
			int biggest = Integer.MIN_VALUE;
			
			for(int j = 0; j < N; j++) {
				int num = readInt();
				
				if(num <= smallest) {
					smallest = num;
				}
				if(num >= biggest) {
					biggest = num;
				}
			}
			
			list[i][0] = smallest;
			list[i][1] = biggest;			
		}
		
		for(int i = 0; i < G; i++) {
			System.out.print(list[i][0] + " " + list[i][1]);
			System.out.println();
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

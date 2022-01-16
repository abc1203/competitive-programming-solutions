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
		int[] heights = new int[N];
		int[] visions = new int[N];
		
		for(int i = 0; i < N; i++) {
			heights[i] = readInt();
			visions[i] = 1;
		}
		
		visions[0] = 0;
		for(int i = 1; i < N; i++) {
			int index = i;
			
			while(heights[i] >= heights[index - 1]) {
				visions[i] += visions[index - 1];
				index -= visions[index - 1];
						
				if(index == 1) {
					break;
				}
			}
			
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(visions[i] + " ");
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

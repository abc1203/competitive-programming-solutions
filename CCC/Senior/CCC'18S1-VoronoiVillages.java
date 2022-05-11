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
		double[] array = new double[N];
		double minSize = Integer.MAX_VALUE;
		
		for(int i = 0; i < N; i++) {
			array[i] = readInt();
		}
		
		Arrays.sort(array);
		
		for(int i = 1; i < N - 1; i++) {
			double left = (array[i] - array[i - 1]) / 2;
			double right = (array[i + 1] - array[i]) / 2;
			double sizeOfNeighborhood = left + right;
			
			if(sizeOfNeighborhood < minSize) {
				minSize = sizeOfNeighborhood;
			}
		}
		
		String numberAsString = String.format ("%.1f", minSize);
		System.out.println(numberAsString);
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

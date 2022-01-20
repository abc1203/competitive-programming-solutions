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
		int[] array = new int[5];
		int[] sums = new int[5];
		
		for(int i = 0; i < 5; i++) {
			array[i] = readInt();
		}
		
		for(int i = 0; i < 5; i++) {
			boolean[] numbers = new boolean[array[i] + 1];
			
			for(int j = 0; j < numbers.length; j++) {
				numbers[j] = true;
			}
			
			for(int j = 2; j < Math.sqrt(array[i]); j++) {
				if(numbers[j] == true) {
					for(int k = (j * j); k <= array[i]; k += j) {
						numbers[k] = false;
					}
				}
			}
			
			for(int j = 2; j < numbers.length; j++) {
				if(numbers[j] == true) {
					sums[i] += j;
				}
			}
		}

		for(int i = 0; i < 5; i++) {
			System.out.println(sums[i]);
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

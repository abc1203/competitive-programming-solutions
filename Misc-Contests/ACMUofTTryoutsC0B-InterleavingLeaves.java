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
		int T = readInt();
		String[] array = new String[T];
		
		for(int i = 0; i < T; i++) {
			array[i] = "";
		}
		
		for(int i = 0; i < T; i++) {
			int N = readInt();
			int index = N - 1;
			String[] pile1 = new String[N];
			String[] pile2 = new String[N];
			
			String s1 = readLine();
			String s2 = readLine();
			
			for(int j = 0; j < N; j++) {
				pile1[j] = Character.toString(s1.charAt(j));
			}
			
			for(int j = 0; j < N; j++) {
				pile2[j] = Character.toString(s2.charAt(j));
			}
			
			while(index >= 0) {
				array[i] += pile2[index] + "" + pile1[index];
				index--;
			}
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println(array[i]);
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

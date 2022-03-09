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
		int[] number = new int[T];
		
		for(int i = 0; i < T; i++) {
			String line = readLine();
			int t = 0;
			
			char[] s = line.toCharArray();
			
			for(int j = 0; j < s.length - 1; j++) {
				if(s[j] == '<' && s[j + 1] == '3') {
					t++;
				}
			}
			
			number[i] = t;
		}
		
		for(int i = 0; i < T; i++) {
			String line = "";
			for(int j = 0; j < number[i] + 1; j++) {
				line += "<3" + " ";
			}
			line = line.trim();
			System.out.println(line);
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

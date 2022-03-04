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
		int ThreeA = readInt();
		int TwoA = readInt();
		int OneA = readInt();
		int ThreeB = readInt();
		int TwoB = readInt();
		int OneB = readInt();
		
		if(ThreeA * 3 + TwoA * 2 + OneA > ThreeB * 3 + TwoB * 2 + OneB) {
			System.out.println("A");
		} else if(ThreeA * 3 + TwoA * 2 + OneA < ThreeB * 3 + TwoB * 2 + OneB) {
			System.out.println("B");
		} else {
			System.out.println("T");
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

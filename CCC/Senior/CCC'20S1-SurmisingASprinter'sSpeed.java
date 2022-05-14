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
		double maxSpeed = Integer.MIN_VALUE;
		double[][] speed = new double[N][2];
		
		for(int i = 0; i < N; i++) {
			speed[i][0] = readDouble();
			speed[i][1] = readDouble();
		}
		
		Arrays.sort(speed, (a, b) -> Double.compare(a[0], b[0]));
		
		for(int i = 0; i < N - 1; i++) {
			double speeed = Math.abs((speed[i + 1][1] - speed[i][1])) / (speed[i + 1][0] - speed[i][0]);
			
			if(speeed > maxSpeed) {
				maxSpeed = speeed;
			}
		}
		
		System.out.println(maxSpeed);
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

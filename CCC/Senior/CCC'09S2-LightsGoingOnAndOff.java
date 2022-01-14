import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	
	public static void main(String[] args) throws IOException {
		int R = readInt(); int L = readInt();
		int lights[] = new int[R];
		Set<Integer> hset[] = new HashSet[R];
		
		for(int i = 0; i < R; i++) {
			hset[i] = new HashSet();
			String str = "";
			
			for(int j = 0; j < L; j++) str += readInt();
			
			lights[i] = Integer.parseInt(str, 2);
			hset[i].add(lights[i]);
		}
		
		for(int i = 1; i < R; i++) {
			for(int element : hset[i - 1]) {
				hset[i].add(lights[i] ^ element);
			}
		}
		
		System.out.println(hset[R - 1].size());
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

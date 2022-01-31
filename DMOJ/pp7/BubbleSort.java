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
		int N = readInt();
		int[] list = new int[N];
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			list[i] = readInt();
		}
		
		for(int j = 0; j < N; j++) {
			System.out.print(list[j] + " ");
		}
		System.out.println();
		
		while(flag) {
			flag = false;
			
			for(int i = 0; i < N - 1; i++) {
				if(list[i] > list[i + 1]) {
					int temp = list[i + 1];
					list[i + 1] = list[i];
					list[i] = temp;
					
					flag = true;
					
					for(int j = 0; j < N; j++) {
						System.out.print(list[j] + " ");
					}
					System.out.println();
				}
			}
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

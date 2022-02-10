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
		int M = readInt();
		int[][] board = new int[N][N];
		int count = 0;
		
		for(int i = 0; i < M; i++) {
			int x = readInt();
			int y = readInt();
			x--;
			y--;
			
			for(int j = 0; j < N; j++) {
				board[x][j] = 1;
				board[j][y] = 1;
			}
			
			int index = 1;
			
			while((x - index) >= 0 && (y + index) < N) {
				board[x - index][y + index] = 1;
				index++;
			}
			
			index = 1;
			
			while((x - index) >= 0 && (y - index) >= 0) {
				board[x - index][y - index] = 1;
				index++;
			}
			
			index = 1;
			
			while((x + index) < N && (y - index) >= 0) {
				board[x + index][y - index] = 1;
				index++;
			}
			
			index = 1;
			
			while((x + index) < N && (y + index) < N) {
				board[x + index][y + index] = 1;
				index++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(board[i][j] == 0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
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

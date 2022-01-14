import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	static int points[] = new int[5];
	static boolean matches[][] = new boolean[5][5];
	static int championCount = 0;
	static int T;
	
	static void solve(int remainingMatches) {
		if(remainingMatches <= 0) {
			int teamPoints = points[T];
			for(int i = 0; i < 5; i++) {
				if(i != T && points[i] >= teamPoints) {
					return;
				}
			}
			championCount++;
			return;
		}
		
		boolean original[][] = new boolean[5][5];
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				original[i][j] = matches[i][j];
			}
		}
		
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				if(!matches[i][j]) {
					matches[i][j] = true;
					matches[j][i] = true;
					
					for(int k = 0; k < 3; k++) {
						if(k == 0) {
							points[i] += 3;
							solve(remainingMatches - 1);
							points[i] -= 3;
						} else if(k == 1) {
							points[j] += 3;
							solve(remainingMatches - 1);
							points[j] -= 3;
						} else {
							points[i]++; points[j]++;
							solve(remainingMatches - 1);
							points[i]--; points[j]--;
						}
					}
				}
			}
		}
		
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				matches[i][j] = original[i][j];
			}
		}
	}

	
	public static void main(String[] args) throws IOException {
		T = readInt(); int G = readInt();
		int remainingMatches = 6 - G; 
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j) {
					matches[i][j] = true;
				} else {
					matches[i][j] = false;
				}
			}
		}
		
		for(int i = 0; i < G; i++) {
			int A = readInt(); int B = readInt();
			int scoreA = readInt(); int scoreB = readInt();
			
			matches[A][B] = true;
			matches[B][A] = true;
			
			if(scoreA > scoreB) {
				points[A] += 3;
			} else if(scoreA < scoreB) {
				points[B] += 3;
			} else {
				points[A]++; points[B]++;
			}
		}
		
		solve(remainingMatches);
		System.out.println(championCount);
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

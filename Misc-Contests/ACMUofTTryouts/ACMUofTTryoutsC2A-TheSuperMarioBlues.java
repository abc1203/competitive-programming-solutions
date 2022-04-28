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
		int[] count = new int[T];
		
		for(int i = 0; i < T; i++) {
			
			String level = readLine();
			
			String[] str = level.split("-");
			int[] levels = {Integer.parseInt(str[0]), Integer.parseInt(str[1])};
			
			while(levels[0] != 8 || levels[1] != 4) {
				count[i]++;
				
				if(levels[0] ==1 && levels[1] == 2) {
					levels[0] = 4;
					levels[1] = 1;
				} else if(levels[0] == 4 && levels[1] == 2) {
					levels[0] = 8;
					levels[1] = 1;
				} else {
					levels[1]++;
					
					if(levels[1] > 4) {
						levels[0]++;
						levels[1] = 1;
					}
				}
				
				//System.out.println(levels[0]);
				//System.out.println(levels[1]);
			}
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println(count[i] + 1);
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

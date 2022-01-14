import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
			int A = readInt(); int B = readInt();
			int N = readInt();
			ArrayList<Integer> hotels = new ArrayList<>();
			hotels.add(0); hotels.add(990); hotels.add(1010); hotels.add(1970); hotels.add(2030); hotels.add(2940); hotels.add(3060);
			hotels.add(3930); hotels.add(4060); hotels.add(4970); hotels.add(5030); hotels.add(5990); hotels.add(6010); hotels.add(7000);
			for(int i = 0; i < N; i++) {
				int location = readInt();
				hotels.add(location);
			}
			
			Collections.sort(hotels);
			
			long numOfWays[] = new long[hotels.size()];
			Arrays.fill(numOfWays, 0);
			numOfWays[0] = 1;
			
			for(int i = 0; i < hotels.size(); i++) {
				for(int j = 0; j < i; j++) {
					int distance = hotels.get(i) - hotels.get(j);
					
					if(distance >= A && distance <= B) {
						numOfWays[i] += numOfWays[j];
					} 
				}
			}
			
			System.out.println(numOfWays[hotels.size() - 1]);
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

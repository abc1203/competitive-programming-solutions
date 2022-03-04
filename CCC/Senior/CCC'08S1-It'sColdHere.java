import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		int temp;
		String city = "";
		int lowestTemp = Integer.MAX_VALUE;
		
		while(input.hasNext()) {
			city = input.next();
			temp = input.nextInt();
			
			hmap.put(city, temp);
		}
		
		for(Map.Entry<String, Integer> entry : hmap.entrySet()) {
			if(entry.getValue() < lowestTemp) {
				city = entry.getKey();
				lowestTemp = entry.getValue();
			}
		}
		
		System.out.println(city);
		
		input.close();
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

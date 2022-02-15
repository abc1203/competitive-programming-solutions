import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		TreeMap<Character, Integer> treeMap1 = new TreeMap<Character, Integer>();
		TreeMap<Character, Integer> treeMap2 = new TreeMap<Character, Integer>();
		String line1 = readLine();
		String line2 = readLine();
		
		line1 = line1.replaceAll("\\s+","");
		line2 = line2.replaceAll("\\s+","");
		
		char[] first = line1.toCharArray();
		char[] second = line2.toCharArray();
		
		for(char c : first) {
			if(treeMap1.containsKey(c)) {
				int count = treeMap1.get(c);
				count++;
				
				treeMap1.put(c, count);
				
			} else {
				treeMap1.put(c, 1);
			}
		}
		
		for(char c : second) {
			if(treeMap2.containsKey(c)) {
				int count = treeMap2.get(c);
				count++;
				
				treeMap2.put(c, count);
				
			} else {
				treeMap2.put(c, 1);
			}
		}
		
		if(treeMap1.equals(treeMap2)) {
			System.out.println("Is an anagram.");
		} else {
			System.out.println("Is not an anagram.");
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

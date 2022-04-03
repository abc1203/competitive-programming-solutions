import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		String T = readLine();
		String S = readLine();
		
		if(solve(T, S)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	
	public static boolean solve(String T, String S) {
		char[] letters = new char[S.length()];
		Set<String> setS = new LinkedHashSet<String>();
		boolean exist = false;
		
		for(int i = 0; i < S.length(); i++) {
			letters[i] = S.charAt(i);
		}
		
		for(int i = 0; i < S.length(); i++) {
			String shift = "";
			int index = i;
			
			for(int j = 0; j < S.length(); j++) {
				shift += Character.toString(S.charAt(index % S.length()));
				index++;
			}
			
			setS.add(shift);
		}
		
		/*
		for(String shift : setS) {
			System.out.println(shift);
		}
		*/
		
		for(int i = 0; i < T.length() - S.length() + 1; i++) {
			String possibleShift = "";
			int index = i;
			
			for(int j = 0; j < S.length(); j++) {
				if(index <= T.length() - 1) {
					possibleShift += Character.toString(T.charAt(index));
					index++;
				}
			}
			//System.out.println(possibleShift);
			
			for(String shift : setS) {
				if(possibleShift.equals(shift)) {
					exist = true;
				}
			}
		}
		
		return exist;
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	
	public static void main(String[] args) throws IOException {
		ArrayList<ArrayList<Integer>> primeFactors = new ArrayList<ArrayList<Integer>>();
		int N = readInt();
		
		for(int i = 0; i < N; i++) {
			int M = readInt();
			ArrayList<Integer> factors = primeFactoring(M);
			
			primeFactors.add(factors);
		}
		
		for(int i = 0; i < primeFactors.size(); i++) {
			for(int j = 0; j < primeFactors.get(i).size(); j++) {
				System.out.print(primeFactors.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static ArrayList<Integer> primeFactoring(int n) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		
		while (n % 2 == 0) { 
	        primeFactors.add(2);
	        n /= 2; 
	    } 
	  
	        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {  
            while (n % i == 0) { 
                primeFactors.add(i);
                n /= i; 
            } 
        } 

        if (n > 2) {
            primeFactors.add(n);
        }
        
        return primeFactors;
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

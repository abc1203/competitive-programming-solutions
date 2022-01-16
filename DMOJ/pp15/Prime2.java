import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	static void sieve(int high, Vector<Integer> primes) {
		boolean isPrime[] = new boolean[(int)(Math.sqrt(high) + 1)];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = false; isPrime[1] = false;
		
		for(int i = 2; i * i <= high; i++) {
			if(isPrime[i] == true) {
				for(int j = i * i; j <= high; j += i) {
					if(j < isPrime.length) {
						isPrime[j] = false;
					}
				}
			}
		}
		
		for(int i = 2; i * i <= high; i++) {
			if(isPrime[i] == true) {
				primes.add(i);
			}
		}
	}
	
	static void segmentedSieve(int low, int high) {
		Vector<Integer> primes = new Vector<>();
		
		sieve(high, primes);
		
		boolean isPrime[] = new boolean[high - low + 1];
		Arrays.fill(isPrime, true);
		
		if(low == 1) {
			isPrime[0] = false;
		}
		
		for(int i : primes) {
			int lowest = low / i;
			
			if(lowest <= 1) {
				lowest = 2 * i;
			} else if(low % i != 0) {
				lowest = (lowest * i) + i;
			} else {
				lowest *= i;
			}
			
			for(int j = lowest; j <= high; j += i) {
				isPrime[j - low] = false;
			}
		}
		
		for(int i = low; i <= high; i++) {
			if(isPrime[i - low] == true) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		int N = readInt(); int M = readInt();
		Vector<Integer> primes = new Vector<>();
		
		if(N >= M) {
			segmentedSieve(M, N);
		} else {
			segmentedSieve(N, M);
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

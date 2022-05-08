import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	static int bubbleSort(int arr[]) {
	    int n = arr.length;
	    int count = 0;
	
	    for(int i = 0; i < n - 1; i++) {
	        //run from 1st cell to last cell
	        //the number of iterations
	
	        for(int j = 0; j < n - i - 1; j++) {
	            //run from 1st cell to "last cell - iteration"
	            if(arr[j] < arr[j + 1]) {
	                int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
	                count++;
	            }
	        }
	    }
	    
	    return count;
	}
	
	public static void main(String[] args) throws IOException {
		int N = readInt();
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = readInt();
		}
		
		
		System.out.println(bubbleSort(arr));
		
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

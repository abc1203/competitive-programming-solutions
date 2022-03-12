import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main (String[] args) throws IOException {
    	int N = readInt();
    	int sCount = 0; int tCount = 0;
    	
    	for(int i = 0; i < N; i++) {
    		String str = readLine();
    		str = str.toLowerCase();
    		
    		for(int j = 0; j < str.length(); j++) {
    			if(str.charAt(j) == 's') {
    				sCount++;
    			}
    			if(str.charAt(j) == 't') {
    				tCount++;
    			}
    		}
    	}
    	
    	if(sCount >= tCount) {
	        System.out.println("French");
	    } else if(tCount > sCount) {
	        System.out.println("English");
	    }
	}
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    
    static String readLine() throws IOException {
        return br.readLine().trim();
    } 
    
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
a

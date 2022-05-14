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
		String line = readLine();
        int vCount=0, hCount=0;
        
        for (int i = 0;i < line.length();i++) {
            if (line.charAt(i)=='V') {
            	vCount++;
            } else {
            	hCount++;
            }
        }
        
        if (vCount % 2 == 0 && hCount % 2 == 0) {
        	System.out.println("1 2\n3 4");                        
        } else if (vCount % 2 == 0) {
        	System.out.println("3 4\n1 2");
        } else if (hCount % 2 == 0) {
        	System.out.println("2 1\n4 3");
        }else {
        	System.out.println("4 3\n2 1");  
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

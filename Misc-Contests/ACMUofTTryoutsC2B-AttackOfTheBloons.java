import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		int T = readInt();
    
	    for(int i = 0; i < T; i++) {
	        int L = readInt();
	        int N = readInt();
	        int cells[] = new int[L + 2];
	        
	        for(int j = 0; j <= L + 1; j++) {
	            cells[j] = 0;
	        }
	        
	        for(int j = 1; j <= N; j++) {
	            int C = readInt();
	            int R = readInt();
	            int D = readInt();
	            
	            if(C - R <= 1) {
	                cells[1] += D; 
	            } else {
	                cells[C - R] += D;
	            }
	            
	            if(R + C >= L + 1) {
	                cells[L + 1] -= D;
	            } else {
	                cells[R + C + 1] -= D;
	            }
	        }
	        
	        for(int j = 1; j <= L + 1; j++) {
	            cells[j] += cells[j - 1];
	        }
	        
	        /*
	        for(int j = 0; j <= L + 1; j++) {
	            cout << cells[j] << " ";
	        }
	        */
	        
	        int M = readInt();
	        int ans[] = new int[M];
	        
	        for(int j = 0; j < M; j++) {
	            int H = readInt();
	            int index = 1;
	            
	            while(H > 0) {
	                H -= cells[index];
	                
	                if(H > 0) {
	                    index++;
	                }
	                
	                if(index >= L + 1) {
	                    break;
	                }
	            }
	            
	            ans[j] = index;
	        }
	        
	        for(int j = 0; j < M; j++) {
	            if(ans[j] == L + 1) {
	                System.out.println("Bloon leakage");
	            } else {
	                System.out.println(ans[j]);
	            }
	        }
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

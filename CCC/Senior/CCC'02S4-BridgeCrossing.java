import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	static class pt {
		String name;
		int time;
		
		public pt(String name, int time) {
			this.name = name;
			this.time = time;
		}
	}
	
	public static void main(String[] args) throws IOException {
		int M = readInt(); int Q = readInt();
		int dp[] = new int[Q + 1];
		pt pt[] = new pt[Q + 1]; pt[0] = new pt("", 0);
		ArrayList<Integer> numPeople = new ArrayList<>();
		int arr[] = new int[Q + 1]; int idx = Q; arr[0] = 0; arr[1] = 1;
		
		for(int i = 1; i <= Q; i++) {
			pt[i] = new pt(readLine(), readInt());
		}
		
		Arrays.fill(dp, 1000000000);
		dp[0] = 0; dp[1] = pt[1].time;
		
		for(int i = 2; i <= Q; i++) {
			int index = M;
			if(index > i) {
				index = i;
			}
			
			while(index > 0) {
				int timeTaken = dp[i - index];
				int maxTime = 0;
				for(int j = i - index + 1; j <= i; j++) {
					maxTime = Math.max(maxTime, pt[j].time);
				}
				
				if(timeTaken + maxTime < dp[i]) {
					dp[i] = timeTaken + maxTime;
					arr[i] = index;
				}
				
				index--;
			}
		}
		
		System.out.println("Total Time: "+ dp[Q]);
		/*
		for(int i = 0; i <= Q; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		*/
		while(idx > 0) {
			numPeople.add(arr[idx]);
			idx -= arr[idx];
		}
		
		Collections.reverse(numPeople);
		/*
		for(int i = 0; i < numPeople.size(); i++) {
			System.out.print(numPeople.get(i) + " ");
		}
		System.out.println();
		*/
		int index = 0;
		int sum = 0;
		for(int i = 0; i < numPeople.size(); i++) {
			sum += numPeople.get(i);
			
			while(index < sum) {
				System.out.print(pt[index + 1].name + " ");
				index++;
			}
			System.out.println();
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static LinkedHashSet<String> set = new LinkedHashSet<String>();
	
	public static void main(String[] args) throws IOException {
		String s = readLine();
		int result = 0;
		
		s = s.replaceAll("[^-?0-9]+", " "); 
		List<String> array = Arrays.asList(s.trim().split(" "));
		
		for(int i = 0; i < array.size(); i++) {
			result += Integer.parseInt(array.get(i));
		}
		
		System.out.println(result);
	}
	
	
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}

import java.util.*;
import java.lang.Math;

public class ShiftySum {
	public static void main(String[] args) {
		int initialNum;
		int num = 0;
		int k;
		Scanner input = new Scanner(System.in);
		
		initialNum = input.nextInt();
		k = input.nextInt();
		input.close();
		
		for(int i = 0; i <= k; i++) {
			num = (int) (num + initialNum * Math.pow(10, i));
		}
		
		System.out.println(num);
	}

}

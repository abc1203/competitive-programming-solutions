import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = 0, M = 0, K = 0;
		int T = input.nextInt();
		int[] prices = new int[T];
		
		for(int i = 0; i < T; i++) {
			ArrayList<String> allItems = new ArrayList<String>();
			ArrayList<String> wantedItems = new ArrayList<String>();
			if(input.hasNextInt()) {
				N = input.nextInt();
			}
			
			for(int j = 0; j < N; j++) {
				if(input.hasNextInt()) {
					M = input.nextInt();
				}
				input.nextLine();
				
				for(int k = 0; k < M; k++) {
					String s = input.nextLine();
					allItems.add(s);
				}
			}
			
			if(input.hasNextInt()) {
				K = input.nextInt();
			}
			input.nextLine();
			
			for(int j = 0; j < K; j++) {
				String s = input.nextLine();
				wantedItems.add(s);
			}
			
			prices[i] = solve(allItems, wantedItems);
		}
		
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		input.close();
	}
	
	
	public static int solve(ArrayList<String> allItems, ArrayList<String> wantedItems) {
		int bestPrice = 0;
		String[][] items = new String[allItems.size()][3];
		String[][] needs = new String[wantedItems.size()][2];
		
		for(int i = 0; i < allItems.size(); i++) {
			String s = allItems.get(i);
			String[] line = s.split(" ");
			
			for(int j = 0; j < 3; j++) {
				items[i][j] = line[j];
			}
		}
		
		for(int i = 0; i < wantedItems.size(); i++) {
			String s = wantedItems.get(i);
			String[] line = s.split(" ");
			
			for(int j = 0; j < 2; j++) {
				needs[i][j] = line[j];
			}
		}
		
		bestPrice = findBestPrice(items, needs);
		
		return bestPrice;
	}
	
	
	public static int findBestPrice(String[][] items, String[][] needs) {
		int bestPrice = 0;
		
		for(int i = 0; i < needs.length; i++) {
			int index = 0;
			int quantity = Integer.parseInt(needs[i][1]);
			int lowestPrice = 2147483647;
			
			while(quantity > 0) {
				index = 0;
				lowestPrice = 2147483647;
				
				for(int j = 0; j < items.length; j++) {
					if(needs[i][0].equals(items[j][0])) {
						int price = Integer.parseInt(items[j][1]);
						
						if(price < lowestPrice) {
							lowestPrice = price;
							index = j;
						}
					}
				}
				
				if(quantity <= Integer.parseInt(items[index][2])) {
					bestPrice += quantity * lowestPrice;
					quantity = 0;
				} else {
					bestPrice += Integer.parseInt(items[index][2]) * lowestPrice;
					quantity -= Integer.parseInt(items[index][2]);
			
					items[index][1] = "2147483647";
				}
			}
		}
		
		return bestPrice;
	}
}

import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	
	static void merging(int arr[], int LEFT, int MID, int RIGHT) {
	    int subArrOne = MID - LEFT + 1;
	    int subArrTwo = RIGHT - MID;
	
	    int[] leftArr = new int[subArrOne];
	    int[] rightArr = new int[subArrTwo];
	
	    //Filling the subarrays
	    for(int i = 0; i < subArrOne; i++) {
	        leftArr[i] = arr[LEFT + i];
	    }
	    for(int j = 0; j < subArrTwo; j++) {
	        rightArr[j] = arr[MID + 1 + j];
	    }
	
	    int indexOfSubArrOne = 0; //initial index of 1st subarray
	    int indexOfSubArrTwo = 0; //initial index of 2nd subarray
	    int indexOfMergedArray = LEFT; //intitial index of merged array
	
	    //Filling the merged array until one of the subarrays are completely filled in
	    while(indexOfSubArrOne < subArrOne && indexOfSubArrTwo < subArrTwo) {
	        if((leftArr[indexOfSubArrOne] % 10) <= (rightArr[indexOfSubArrTwo] % 10)) {
	            arr[indexOfMergedArray] = leftArr[indexOfSubArrOne];
	            indexOfSubArrOne++;
	        } else {
	            arr[indexOfMergedArray] = rightArr[indexOfSubArrTwo];
	            indexOfSubArrTwo++;
	        }
	
	        indexOfMergedArray++;
	    }
	
	    //Copying the leftover elements of the subarrays into the merged array
	    while(indexOfSubArrOne < subArrOne) {
	        arr[indexOfMergedArray] = leftArr[indexOfSubArrOne];
	
	        indexOfMergedArray++;
	        indexOfSubArrOne++;
	    }
	    while(indexOfSubArrTwo < subArrTwo) {
	        arr[indexOfMergedArray] = rightArr[indexOfSubArrTwo];
	
	        indexOfMergedArray++;
	        indexOfSubArrTwo++;
	    }
	}
	
	static void mergeSort(int arr[], int BEGIN, int END) {
	    if(BEGIN >= END) {
	        return;
	    }
	
	    int mid = BEGIN + (END - BEGIN) / 2;
	
	    mergeSort(arr, BEGIN, mid);
	    mergeSort(arr, mid + 1, END);
	    merging(arr, BEGIN, mid, END);
	}





	public static void main(String[] args) throws IOException {
		int N = readInt();
		int[] nums = new int[N];
		
		for(int i = 0; i < N; i++) {
			nums[i] = readInt();
		}
		
		mergeSort(nums, 0, N - 1);
		
		ArrayList<Integer> sortIndex = new ArrayList<Integer>();
		sortIndex.add(0);
		
		for(int i = 1; i < N; i++) {
			if(nums[i] % 10 != nums[i - 1] % 10) {
				sortIndex.add(i);
			}
		}
		sortIndex.add(N);
		
		for(int i = 1; i < sortIndex.size(); i++) {
			Arrays.sort(nums, sortIndex.get(i - 1), sortIndex.get(i));
		}
		
		for(int i = 1; i < sortIndex.size(); i++) {
			for(int j = sortIndex.get(i) - 1; j >= sortIndex.get(i - 1); j--) {
				System.out.print(nums[j] + " ");
			}
		}
		
		/*
		System.out.println();
		for(int i = 0; i < N; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < sortIndex.size(); i++) {
			System.out.print(sortIndex.get(i) + " ");
		}
		*/
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

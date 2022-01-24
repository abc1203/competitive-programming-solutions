import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];
        
        for(int i = 0; i < 3; i++) {
           array[i] = input.nextInt(); 
        }
        
        Arrays.sort(array);
        
        System.out.println(array[1]);
    }
}

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n= scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		int sum=0;
		for(int i=0; i<n; i++) {
			for(int k=0; k<=i;k++) {
				sum+= arr[k];
			}
		}
		System.out.println(sum);
		
		scanner.close();
	}
}

import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String temp1 = new String(in.nextLine());
		String[] temp2 = temp1.split(" ");
		String A = temp2[0];
		String B = temp2[1];
		
		int difference = B.length()-A.length()+1;
		int[] arr = new int[difference];
		
		for(int i=0; i<difference; i++) {
			int count = 0;
			for(int k=i; k<A.length()+i;k++) {
				if(A.charAt(k-i) != B.charAt(k)) {
					count++;
				}
			}
			
			arr[i]=count;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
		in.close();
	}

}

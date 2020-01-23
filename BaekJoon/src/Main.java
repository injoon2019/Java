import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		StringBuilder temp= new StringBuilder(in.nextLine());
		
		for(int i=0; i<n; i++) {
			temp= new StringBuilder(in.nextLine());
			temp.reverse();
			StringBuilder jun = new StringBuilder();
			String[] temp2 = temp.toString().split(" ");
			int a = Integer.parseInt(temp2[0]);
			int b = Integer.parseInt(temp2[1]);
			String ans =  Integer.toString(a+b);
			jun.append(ans);
			jun.reverse();
			System.out.println(Integer.parseInt(jun.toString()));
		}
		
		
		
		in.close();
	}

}

import java.util.*;
import java.io.*;


class Solution {
	
	
    public static void main(String[] args) {
        // write your code in Java SE 8
    	
    	long[] A = new long[] {0};
        long sum=0;
        for(int i=0; i<A.length; i++){
            sum += (long)Math.pow(2,A[i]);
        }
        
        int count = 0;
    	int num=0;
    	
        while(sum >=0) {
        	
        	num=0;
	        while(sum>= (long)Math.pow(2,num)){
	            num++;
	        }
	        if(num!=0)
	        	num--;
	        
	        if(sum==0)
	        	break;
	        sum -=  (int)Math.pow(2,num);
	        
	        
	        count++;
	        
        }
        System.out.println(count);
        

        
        
    }
}
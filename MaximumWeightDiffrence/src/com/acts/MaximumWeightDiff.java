package com.acts;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumWeightDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no Of test Cases");
        int T = sc.nextInt();
        System.out.println("Enter the Value of K");
        int K = sc.nextInt();
        System.out.println("Enter the Value of N");
        int N = sc.nextInt();
        int[]arr = new int[N];
        long s1=0;
	    long s2=0;
        for(int i=0; i< N ; i++) {
        	arr[i] = sc.nextInt();
        }
	
	    Arrays.sort(arr);
	    
	    int g=Math.min(K,N-K);
	    for(int i=0;i<g;i++)
	    {
	        
	        s1+=arr[i];
	                
	    }      
	    for(int i=g;i<N;i++)
	    {
	        
	        s2+=arr[i];
	        
	    }
	    long h=s2-s1;
	    System.out.println(h);
	}
}




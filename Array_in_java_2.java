//Code to input numbers in a array x defined by user , find a number input by user in array and print its index

package test;

import java.util.Scanner;

public class Array_in_java_2 {

public static void main(String args[]) {
		
		
		Scanner inText=new Scanner (System.in);
		
		System.out.print("Enter Array Size : ");
		
		int num= inText.nextInt();
		
		int data[]= new int[num];
		
		
		for (int i =0;i<=num-1;i++) {
			System.out.print("Enter Array values ["+i+"] : ");	
			data[i]=inText.nextInt();
		}
		System.out.print("Enter num ber to be found : ");
		int num_to_search= inText.nextInt();
		
		int flag=0;
		for (int i =0;i<=num-1;i++) {
			if(data[i]==num_to_search) {
				
				
			System.out.println("Number Found at location : "+i);
			flag=1;
			}
			
		}
		if (flag==0) {System.out.println("Number "+ num_to_search+" not found in Array");}
		
		
}
	
}

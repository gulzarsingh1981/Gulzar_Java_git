
//Java code to input an x size of array as int and store x values from user and print array


package test;



import java.util.Scanner;

public class Array_in_Java {
	
	public static void main(String args[]) {
		
		
		Scanner inText=new Scanner (System.in);
		
		System.out.print("Input  array size  : ");
		
		int size=inText.nextInt();
		int scores[]= new int[size];
		
		for(int i=0 ;i<=size-1;i++) {
		scores[i]= inText.nextInt();	
			
		}
		for(int i=0 ;i<=size-1;i++) {
			
			System.out.println("You scored "+scores[i] );
			}
		
	}

}

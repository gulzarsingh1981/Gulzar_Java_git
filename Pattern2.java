package test;

/*
 * Code for a pattern like below:
 *    0 
     1 1 
    2 2 2 
   3 3 3 3 
  4 4 4 4 4 
 5 5 5 5 5 5 
 */

public class Pattern2 {
	
	public static void main(String[] args) {
	
	int n=5;
	
	for (int i=0; i<=n;i++){
		for (int j=0; j<=n-i;j++){
			
			System.out.print(" ");}
		
		for(int j=0;j<=i;j++)
			
			{System.out.print(i+" ");}
		
		
		System.out.println();
	}}

}

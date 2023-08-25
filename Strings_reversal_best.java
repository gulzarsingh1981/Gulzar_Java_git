// String reversal in half iterations;

package test;

public class Strings_reversal_best {
	
public static void main(String args[]) {
		
		StringBuilder  name = new StringBuilder("welcome to india");
			for(int i=name.length()/2;i>=0;i--) {
				int idf=i;
				int ifb=name.length()-1-i;
				char f= name.charAt(i);
				char b= name.charAt(ifb);
				name.setCharAt(i, b);
				name.setCharAt(name.length()-i-1, f);
			}
				System.out.println(name);
		
		
		
	}


}

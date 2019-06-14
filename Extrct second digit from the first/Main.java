import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      
        // Initialize sum value as 0
	    
      
        // Extract last digit repeatedly and store it in sum
        // until given number n reaches 0
		while(n >=100)
		{ 
           // Extract last digit
		   n=n/10;
           
           
		   
		}
      n=n%10;
		System.out.print(n);
	}
}
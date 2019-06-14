import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      
        // Initialize sum value as 0
	    int last_digit=n%10;
      
        // Extract last digit repeatedly and store it in sum
        // until given number n reaches 0
		while(n >=10)
		{ 
           // Extract last digit
		   n=n/10;
           
           
		   
		}
      
    int  sum=last_digit+n;
		System.out.print(sum);
	}
}
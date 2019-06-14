import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int n1,n2,sum;
      Scanner in= new Scanner(System.in);
      int num=in.nextInt();
      n1=num/100;
      n2=num%10;
      sum=n1+n2;
      System.out.println(sum);
      
	}
}
import java.util.Scanner;
class Main{
  public static int sum_of_digits(int a){
    int sum=0;
    for(int num=1; num<=a; num++){
      sum= sum+num;
  }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(sum_of_digits(n));
      
	}
}
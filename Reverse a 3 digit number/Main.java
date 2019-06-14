import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int first_digit,second_digit,last_digit,reverse;
    
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    first_digit=num/100;
      second_digit=(num/10)%10;
      last_digit=num%10;
    reverse=(last_digit*100)+(second_digit*10)+first_digit;
    System.out.println(reverse);
      
    
    
  }
}
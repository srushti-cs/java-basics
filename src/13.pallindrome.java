import java.util.Scanner;

class pallindrome {
    //pallindrome means reverse and forward number shoulb be same
    static void main(String[] args) {
        System.out.println("ENTER THE NUMBER: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev =0;
        int digit =0;
        int num = n;
      while(n!=0)
        {
            digit = n % 10;
            rev = (rev*10) + digit;
            n = n/10;
        }
        System.out.println("the revserse number is " + rev);
      if( rev == num)
      {
          System.out.println("the number is pallindrome");
      }
      else {
          System.out.println("the number is not pallindrome");
      }
    }
}

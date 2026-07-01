import java.util.Scanner;

class ifelse {
     static void main(String[] args) {
         System.out.println("enter the number: ");
         Scanner input = new Scanner(System.in);
         int num = input.nextInt();
         if(num>0)
         {
             System.out.println("the number is positive ");
         }
         else if(num<0)
         {
             System.out.println("the number is negative");
         }
         else
         {
             System.out.println("the number is zero");
         }
     }
}

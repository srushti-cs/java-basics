import java.util.Scanner;

class fibonacci {//fibonacci means 0,1,1,2,3,5,8,13....
     static void main(String[] args) {
         System.out.println("ENTER THE NUMBER : ");
         Scanner input = new Scanner(System.in);
         int num = input.nextInt();
         int a =0;
         int b=1;
         for(int i=0;i<=num;i++)
         {
             System.out.println(a + " ");
             int c= a + b;
             a=b;
             b=c;


         }

     }
}

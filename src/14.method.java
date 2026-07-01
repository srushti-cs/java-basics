import java.util.Scanner;
//PATTERNS QUETIONS ON NEXT DIRECTORY GO THROUGH IT.....

class method {
     static void main(String[] args) {
       Scanner input=new Scanner(System.in);
         System.out.println("enter the two number of multiplication");
       int n= input.nextInt();
        int m = input.nextInt();

         int multi = multiplication(n,m);
         System.out.println(multi);

         int add =addition();
         System.out.println(add);
     }

     static int multiplication(int n,int m)
     {
         System.out.println("the multiplication of numbers: ");

         int mul = n*m;
         return mul;
     }
    static int addition()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the two numbers for addition :");
        int x= input.nextInt();
        int y = input.nextInt();
        int sum =  x+y;
        return sum;
    }
}

import java.util.Scanner;

class forloop {
    static void main(String[] args) {
        System.out.println("enter the number of odd numbers you want to add");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            if(i%2==1)
            {
               //int  sum = 0;
               sum = sum + i;
                //System.out.println("the sum of odd number:" + sum);
            }
//            System.out.println("the sum of odd number:" + sum);
//            if(i%2==0)
//            {
//                sum = sum +i;
//                System.out.println("the sum of even number:" + sum);
//            }
//            {
//                sum = sum + i;
//                System.out.println("the sum of all numbers:" + sum);
//            }
        }
        System.out.println("the sum of odd number:" + sum);
    }
}

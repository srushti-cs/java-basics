import java.util.Scanner;

class sumofdigit {
    static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum =0;
        int digit =0;
//        for(int i=0;i<n;i++)
        while(n!=0)
        {
            digit= n%10;
            sum = sum + digit;
            n = n/10;
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

class reverse {
    static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int digit =0;
        int rev=0;
        while(n!=0)
        {
            digit = n%10;
            rev = (rev + digit)*10;
            n=n/10;
        }
        System.out.println(rev/10);
    }
}

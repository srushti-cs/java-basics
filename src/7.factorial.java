import java.util.Scanner;

class factorial {
    static void main(String[] args) {
        System.out.println("ENTER THE NUMBER OF WHICH YOU WANT FACTORIAL");
        Scanner input =new Scanner(System.in);
        int num = input.nextInt();
        int fact=1;

        for(int i=1;i<=num;i++)
        {
            fact = fact * i;

        }
        System.out.println(fact);
    }
}

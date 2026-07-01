import java.util.Scanner;

class armstrong { //armstrong means sum of its cube is equal to the number
    static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digit = 0;
        int cube = 0;
        int sum = 0;
        int n = num;
        while (num != 0)
        {
            digit = num % 10;
            cube = digit * digit * digit;
            sum = sum + cube;
            num = num / 10;
        }


            if (sum == n) {
                System.out.println("the number is an armstrong ....");
            } else {
                System.out.println("the is not sn armstrong number...");
            }
            System.out.println(sum);
            System.out.println(num);
        }
    }


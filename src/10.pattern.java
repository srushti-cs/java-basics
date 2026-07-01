import java.util.Scanner;
class pattern {
    static void main(String[] args) {
        System.out.println("enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                System.out.println("*");
            }
        }
    }
}


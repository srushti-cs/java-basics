import java.util.Scanner;

class operation {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENETER THE VALUE OF A");
        int a= input.nextInt();
        System.out.println("ENETER THE VALUE OF B");
        int b= input.nextInt();
        System.out.println("addition: " + (a+b));
        System.out.println("subtraction: " + (a-b));
        System.out.println("multiplication: " + (a*b));
        System.out.println("quotient: "+(a/b));
        System.out.println("remainder: "+(a%b));


    }
}

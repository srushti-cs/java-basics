import java.util.Scanner;

 class input {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("WHAT IS YOUR AGE??");
        int age = input.nextInt();
        System.out.println("Your age is :" + age);


    }
}

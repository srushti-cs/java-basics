import java.util.Scanner;

class greatestnumber {
    static void main(String[] args) {
        // IN THIS PGM I USED LOGICAL OPERATOR AND REALATIONAL
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number a ");
        int a = input.nextInt();
        System.out.println("enter the number b ");
        int b = input.nextInt();
        System.out.println("enter the number c ");
        int c = input.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+ " is the greatest among all");
        }
        else if(b>c)
        {
            System.out.println(b+ " is the greatest among all");
        }
        else
        {
            System.out.println(c+" is greatest among all");
        }

    }
}

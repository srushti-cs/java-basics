import java.util.Scanner;

class whileloop {
    static void main(String[] args) {
        System.out.println("ENTER THE NUMBER FOR ITS MULTIPLICATION TABLE : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        while(i<=10)
        {
            System.out.println(num + "*" + i + "=" + (num*i));
            i++;
        }
    }
}

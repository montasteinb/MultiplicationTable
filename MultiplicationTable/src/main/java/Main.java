import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print multiplication table: ");
        number = scanner.nextInt();
        for(i=1;i<=12;i++) {
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
}

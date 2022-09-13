import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();

        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.print(1);
            return;
        }
        System.out.print(0);
    }
}
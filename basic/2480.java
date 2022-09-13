import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice0 = sc.nextInt();
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();

        if (dice0 == dice1 && dice1 == dice2) {
            System.out.println(10000 + (dice0) * 1000);
        } else if (dice0 == dice1 || dice1 == dice2 || dice0 == dice2) {
            int num = dice0 == dice1 ? dice0 : dice2;
            System.out.println(1000 + num * 100);
        } else {
            int num = Math.max(dice0, Math.max(dice1, dice2));
            System.out.println(num * 100);
        }
    }
}
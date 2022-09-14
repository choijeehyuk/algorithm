import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fee0 = 0;
        int fee1 = 0;
        int second = 0;
        for (int i = 0; i < n; ++i) {
            second = sc.nextInt();
            fee0 += (second / 30 + 1) * 10;
            fee1 += (second / 60 + 1) * 15;
        }

        if (fee0 == fee1) {
            System.out.print("Y M ");
            System.out.print(fee0);
        } else if (fee0 > fee1) {
            System.out.print("M ");
            System.out.print(fee1);
        } else {
            System.out.print("Y ");
            System.out.print(fee0);
        }

    }
}
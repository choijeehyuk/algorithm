import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int n;
        for (int i = 0; i < 7; ++i) {
            n = sc.nextInt();
            if ((n & 1) == 1) {
                sum += n;
                min = Math.min(n, min);
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ary = new int[20];
        for (int i = 0; i < 20; ++i) {
            ary[i] = i + 1;
        }
        for (int i = 0; i < 10; ++i) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j <= (end + start) / 2; ++j) {
                int tmp;
                tmp = ary[j - 1];
                ary[j - 1] = ary[end + start - j - 1];
                ary[end + start - j - 1] = tmp;
            }
        }

        for (int i = 0; i < 20; ++i) {
            System.out.print(ary[i] + " ");
        }

    }
}
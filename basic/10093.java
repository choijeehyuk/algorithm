import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input1 = sc.nextLong();
        long input2 = sc.nextLong();


        long start = Math.min(input1, input2);
        long end = Math.max(input1, input2);
        long ret = end - start - 1;
        ret = ret < 0 ? 0 : ret;

        System.out.println(ret);

        for (long i = start + 1; i < end; ++i) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
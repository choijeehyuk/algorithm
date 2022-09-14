import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "DCBAE";

        for (int i = 0; i < 3; ++i) {
            int sum = 0;
            for (int j = 0; j < 4; ++j) {
                sum += sc.nextInt();
            }
            System.out.println(res.charAt(sum));
        }
    }
}
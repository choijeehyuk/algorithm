import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ary = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 9; ++i) {
            ary.add(sc.nextInt());
            sum += ary.get(i);
        }
        Collections.sort(ary);
        OUT:for (int i = 0; i < 8; ++i) {
            for (int j = i + 1; j < 9; ++j) {
                if (sum - ary.get(i) - ary.get(j) == 100) {
                    ary.set(i, 0);
                    ary.set(j, 0);
                    break OUT;
                }
            }
        }
        for (int i = 0; i < 9; ++i) {
            if (ary.get(i) != 0) {
                System.out.println(ary.get(i));
            }
        }
    }
}
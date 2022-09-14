import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ary = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            ary.add(sc.nextInt());
            sum += ary.get(i);
        }
        Collections.sort(ary);
        System.out.println(sum / 5);
        System.out.println(ary.get(2));
    }
}
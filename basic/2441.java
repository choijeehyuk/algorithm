import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; ++i) {
            int j = 0;
            for (; j < i; ++j) {
                bw.write(' ');
            }
            for (; j < n; ++j) {
                bw.write('*');
            }
            bw.write('\n');
        }

        bw.flush();
        bw.close();
    }
}
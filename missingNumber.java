import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class missingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int xorAll = 0;
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        int xorInput = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            xorInput ^= Integer.parseInt(st.nextToken());
        }

        System.out.println(xorAll ^ xorInput);
    }
}
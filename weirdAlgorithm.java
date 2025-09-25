import java.util.Scanner;
import java.util.ArrayList;

public class weirdAlgorithm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();

        ArrayList<Long> c = new ArrayList<>();
        c.add(a);

        while (a != 1) {
            if (a % 2 == 0) {
                a /= 2;
            } else {
                a = a * 3 + 1;
            }
            c.add(a);
        }

        for (long num : c) {
            System.out.print(num + " ");
        }
    }
}
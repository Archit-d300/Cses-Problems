import java.util.Scanner;

class missingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long sum = 0;
        long a = (long) (n * (n + 1)) / 2;
        for (int i = 1; i < n; i++) {
            sum += (long) s.nextInt();
        }
        System.out.println(a - sum);
        s.close();
    }
}
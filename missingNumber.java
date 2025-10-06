import java.util.*;
class missingNumber {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            set.add(s.nextInt());
        }
        for (int j = 1; j <= n; j++) {
            if (!set.contains(j)) {
                System.out.println(j);
                break;
            }
        }
    }
}
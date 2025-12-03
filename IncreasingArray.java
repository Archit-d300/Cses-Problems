import java.util.*;
class IncreasingArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long moves = 0;
        int prev = s.nextInt();  

        for (int i = 1; i < n; i++) {
            int curr = s.nextInt();
            if (curr < prev) {
                moves += (prev - curr);  
            } else {
                prev = curr;  
            }
        }

        System.out.println(moves);
        s.close();
    }
}
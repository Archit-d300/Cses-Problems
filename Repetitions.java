import java.util.*;
class Repetitions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()==1){
            System.out.println(1);
            return;
        }

        int maxLen = 0;
        int currentLen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
            } else {
                currentLen = 1;
            }

            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }
        System.out.println(maxLen);
    }
}
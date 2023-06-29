
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String strings[] = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(isPattern(strings[i]));
        }
    }

    static String isPattern(String s) {
        while (true) {
            String s1 = s;
            s = s.replace("<>", "").replace("()", "").replace("{}", "").replace("[]","");
            if (s.equals(s1)) break;
        }
        if (s.equals("")) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

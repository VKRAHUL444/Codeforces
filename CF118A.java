import java.util.Scanner;

public class CF118A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            s = s.toLowerCase();
            
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                
                if (ch != 'a' && ch != 'e' && ch != 'i'
                        && ch != 'o' && ch != 'u' && ch != 'y') {
                    System.out.print("." + ch);
                }
            }
        }
    }
}
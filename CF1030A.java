import java.util.Scanner;

public class CF1030A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            boolean hard = false;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                
                if (x == 1) {
                    hard = true;
                }
            }
            
            if (hard)
                System.out.println("HARD");
            else
                System.out.println("EASY");
        }
    }
}
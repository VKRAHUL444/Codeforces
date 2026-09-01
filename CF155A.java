import java.util.Scanner;

public class CF155A{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            int first = sc.nextInt();
            int max = first;
            int min = first;
            int amazing = 0;
            
            for (int i = 1; i < n; i++) {
                int score = sc.nextInt();
                
                if (score > max) {
                    max = score;
                    amazing++;
                } else if (score < min) {
                    min = score;
                    amazing++;
                }
            }
            
            System.out.println(amazing);
        }
    }
}
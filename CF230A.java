import java.util.*;

public class CF230A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt();
            int n = sc.nextInt();
            
            int[][] dragons = new int[n][2];
            
            for (int i = 0; i < n; i++) {
                dragons[i][0] = sc.nextInt(); // dragon strength
                dragons[i][1] = sc.nextInt(); // bonus
            }
            
            // Sort dragons by strength
            Arrays.sort(dragons, (a, b) -> Integer.compare(a[0], b[0]));
            
            for (int i = 0; i < n; i++) {
                int dragonStrength = dragons[i][0];
                int bonus = dragons[i][1];
                
                if (s > dragonStrength) {
                    s += bonus;
                } else {
                    System.out.println("NO");
                    sc.close();
                    return;
                }
            }
            
            System.out.println("YES");
        }
    }
}
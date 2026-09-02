import java.util.HashMap;
import java.util.Scanner;

public class CF977B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String s = sc.next();
            
            HashMap<String, Integer> map = new HashMap<>();
            
            String answer = "";
            int maxCount = 0;
            
            for (int i = 0; i < n - 1; i++) {
                String twoGram = s.substring(i, i + 2);
                
                map.put(twoGram, map.getOrDefault(twoGram, 0) + 1);
                
                if (map.get(twoGram) > maxCount) {
                    maxCount = map.get(twoGram);
                    answer = twoGram;
                }
            }
            
            System.out.println(answer);
        }
    }
}
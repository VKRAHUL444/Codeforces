import java.util.Scanner;

public class CF25A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            int even = 0;
            int odd = 0;
            int evenIndex = -1;
            int oddIndex = -1;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                
                if (a[i] % 2 == 0) {
                    even++;
                    evenIndex = i;
                } else {
                    odd++;
                    oddIndex = i;
                }
            }
            
            if (even == 1) {
                System.out.println(evenIndex + 1);
            } else {
                System.out.println(oddIndex + 1);
            }
        }
    }
}
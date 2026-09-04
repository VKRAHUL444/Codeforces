import java.util.Scanner;

public class CF479A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int ans = Math.max(
                    Math.max(a + b + c, a * b * c),
                    Math.max(
                            Math.max((a + b) * c, a * (b + c)),
                            Math.max(a + b * c, a * b + c)
                    )
            );
            
            System.out.println(ans);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt1,cnt2,cnt3 = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                cnt3++;
            }
            else if (i % 3 == 0) {
                cnt1++;
            }
            else if (i % 2 == 0) {
                cnt2++;
            }
            
        }

    }
}
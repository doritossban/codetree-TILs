import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        int sum = 0; cnt = 0;
        double avg;

        a = sc.nextInt();
        b = sc.nextInt();

        // a부터 b까지의 수 중 5또는 7의 배수인 수들을 더합니다.
        for(int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt ++;

            }
        }

        avg = (double)sum / cnt;

        System.out.printf("%d %.1f", sum, avg);

    }
}
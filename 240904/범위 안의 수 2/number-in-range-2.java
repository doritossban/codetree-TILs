import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        int count = 0;
        double avg = 0;


        for (int i = 1; i <= 10; i++) {
            num = sc.nextInt();

            if ( num >= 0 && num <= 200 ) {
                sum += num;
                count += 1;
            }

        }
        avg = (double) sum / count;

        System.out.printf("%d %.1f" , sum, avg);
    }
}
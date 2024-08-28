import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        if (a >= b) {

            for ( int i = b; a >= i; i++) {
                if ( i % 2 == 0)
                cnt += i;
            }
        }
        else {
            for (int i = a; b >= i; i++) {
                if ( i%2 == 0)
                cnt += i;
            }
        }

        System.out.println(cnt);



    }
}
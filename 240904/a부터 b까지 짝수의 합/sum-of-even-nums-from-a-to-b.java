import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

            for (int i = a; i <= b; i++) {
                if ( i % 2 == 0 ) {
                    count += i;
                }
            }
        System.out.println(count);



    }
}
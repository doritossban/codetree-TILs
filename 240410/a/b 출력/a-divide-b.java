import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        //정수 부분을 먼저 출력합니다.
        System.out.print(a / b + ".");

        a %= b;

        for (int i = 0; i <20; i ++) {

            a *= 10;
            System.out.print(a / b);

            a %=b; 


        }
    }
}
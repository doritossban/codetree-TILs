import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        for( int i = a; i >= b; i-- ) {
            System.out.print(i + " ");
        }
    }
}
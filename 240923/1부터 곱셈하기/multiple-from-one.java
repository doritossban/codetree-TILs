import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;

        for( int i = 1; i <= 10; i++) {
            mul *= i;
            
            if ( mul >= n) {
                System.out.print(i);
                break;
            }
        }
    }
}
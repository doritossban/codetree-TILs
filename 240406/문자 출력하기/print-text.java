import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        char a = sc.next().charAt(0);
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
        }
    }
}
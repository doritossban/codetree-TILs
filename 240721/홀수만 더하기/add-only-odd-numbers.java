import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        int sum = 0;

        for (int j = 0; j < a; j++) {
         n = sc.nextInt();

       
        
        if ( n%2 == 1 && n%3 == 0)
        sum += n;
        }
        
        System.out.println(sum);

    }
}
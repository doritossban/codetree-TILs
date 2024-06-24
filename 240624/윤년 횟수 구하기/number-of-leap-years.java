import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //변수 선언 및 입력
        int n;
        n = sc.nextInt();
        int cnt = 0;

        // 1년부터 n년까지 윤년의 횟수를 구합니다.
        for(int i = 1; i <= n; i++) {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) // 100으로 나누어 떨어지는건 평년 400으로 나누어 떨어지는건 윤년
                cnt++;
        }

        System.out.print(cnt);
    }
}
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
        if ( i % 3 == 0 ) {
            System.out.print('0' + " ");
        }
        else if ( (i%10)%3 == 0 ) {
            System.out.print('0' + " ");
        }
        else {
            if ( i % 30 == 0) {
            for (int j = 0; j == 9; j++) {
            System.out.print("0" + " ");
            }
            i++;
        }
            System.out.print(i + " ");
        }

        

        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a == 'S'){
            System.out.println("Superior");
        }
        if (a == 'A'){
            System.out.println("Excellent");
        }
        if (a == 'B') {
            System.out.println("Good");
        }
        if (a == 'C') {System.out.println("Usually");
        }
        if ( a == 'D') {
            System.out.println("Effort");
        }

    }
}
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a1 = sc.next().charAt(0);
        int a2 = sc.nextInt();
        char b1 = sc.next().charAt(0);
        int b2 = sc.nextInt();
        char c1 = sc.next().charAt(0);
        int c2 = sc.nextInt();
        
        if (a1 == 'Y' && a2 >= 37) {
            if (b1 =='Y' && b2 >= 37) {
                System.out.print("E");
            }
            else if(c1 == 'Y' && c2 >=37) {
                System.out.print("E");
            }
            else {
                System.out.print("N");
            }
            
        }
        else {
            if (b1 =='Y' && b2 >= 37) {
                if(c1 == 'Y' && c2 >=37) {
                System.out.print("E");
            }
            }
            else {
                System.out.print("N");
            }
        }

    }
}
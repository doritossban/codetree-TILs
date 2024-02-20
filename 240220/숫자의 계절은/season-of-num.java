import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if( 2 >= a || 12 <= a){
            System.out.print("Winter");
        }
        else if( 9 <= a  &&  a <= 11){
            System.out.print("Fall");
        }
        else if( 6 <= a  &&  a <= 8){
            System.out.print("Summer");
        }
        else {
            System.out.print("Spring");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        int num = 0;

        while(true) {
             
             n = n/i;
              if (n <= 1) break;
             i++;
            //int 형 자료이기 때문에
           // System.out.print(n);
            
           
            

        }    
        System.out.print(i);
        
    }
}
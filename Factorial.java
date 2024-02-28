import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int f = 1;
        int i = 1;
        while( i <= num){

            f = f * i;
            i++;

        }

        System.out.println("factorial of number is :" + " " + f);
    }
    
}

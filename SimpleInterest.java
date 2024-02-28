import java.util.*;
public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal");
        int P = sc.nextInt();
        System.out.println("enter the Rate");
        int R = sc.nextInt();
        System.out.println("enter the time");
        int T = sc.nextInt();
        int simpleinterest = (P * R * T)/100;
        System.out.println("simple-interest = " + " " + simpleinterest);
    }
    
}

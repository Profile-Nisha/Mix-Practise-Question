import java.util.*;
public class CompoundInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal");
        double P = sc.nextDouble();
        System.out.println("enter the rate");
        double R = sc.nextDouble();
        System.out.println("enter the time");
        double T = sc.nextDouble();
        double CompundInterest = P * (Math.pow(1 + (R/100), T));
        System.out.println("compund-Interest = " + " " + CompundInterest);
    }
}

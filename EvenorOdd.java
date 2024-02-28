public class EvenorOdd{
    public static void OddOrEven(int n){
        int bitMask=1;
        if(( n & bitMask )== 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void main(String args[]){
        OddOrEven(10);

    }
}
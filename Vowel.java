public class Vowel {
    public static void VowelOrConsonant(char y){
        if( y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u'  ){
            System.out.println("is vowel");
        }else{
            System.out.println("is consonant");
        }
    }
    public static void main(String args[]){
         VowelOrConsonant('a');
         VowelOrConsonant('c');
         VowelOrConsonant('e');

    }
    
}

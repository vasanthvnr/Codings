import java.util.Scanner;
public class vowel {
    static boolean vowels(char b){
        String s="aeiouAEIOU";
        for (int i=0;i<s.length();i++) {
            if (b == (s.charAt(i))) {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char a=input.next().charAt(0);
        if(vowels(a)){
            System.out.println(a+" is vowel");
        }
        else
            System.out.println(a+" is not a vowel");
    }
}

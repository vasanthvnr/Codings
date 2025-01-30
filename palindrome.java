import java.util.Scanner;
public class palindrome {

    static String palin(String s){
        for (int i=s.length()-1;i>=0;i--){
            String reversed="";
            reversed+=s.charAt(i);
        }

        return s;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String :");
        String num=input.nextLine();

        String num1=num.toLowerCase().replaceAll("[ ,:]","");
        String pal=palin(num1);
        System.out.println(pal);
        if(num1.equals(pal)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }

    }
}

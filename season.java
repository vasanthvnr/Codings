import java.util.Scanner;

public class season {
    static String ismonth(int m){
        if(m>=3 && m<=5){
            return "Spring Season";
        } else if (m>=6 && m<=8) {
            return "Summer Season";
        } else if (m>=9 && m<=11) {
            return "Autumn Season";
        } else if (m==12 && m>=1 && m<=2) {
            return "Winter Season";
        }
        else{
            return "Invalid input";
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a month : ");
        int month=in.nextInt();
        System.out.println(ismonth(month));

        }
    }


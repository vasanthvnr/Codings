
import java.util.Scanner;
public class date {
    static boolean isLeapyear(int a){
        return (a%4==0 && a%100!=0 || a%400==0);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Date :");
        String s=input.nextLine();
        String[] s1=s.split("/");
        int year=Integer.parseInt(s1[0]);
        int month =Integer.parseInt(s1[1]);
        int date=Integer.parseInt(s1[2]);
        int[] days ={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapyear(year)){
            days[1]=29;
        }
        int daysY=0;
        for (int i=0;i<month-1;i++){
            daysY+=days[i];

        }
        daysY+=date;
        System.out.println(daysY);



    }
}

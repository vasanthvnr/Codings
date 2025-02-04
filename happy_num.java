//happy number


public class happy_num {
    static boolean happy(int a){
        
        if(a==1){
            return true;
        }
        else{
            return isHappy(a);
        }
    }
    public static boolean isHappy(int n) {
        if(n<7 && n>1){//2 
            return false;
        }
        int result=0;
        while(n>0){
            int l=n%10;//rem 
            result+=l*l;//82
            n=n/10;

        }
        if(result==1){
            return true;
        }
        else {
            return happy(result);
        }
        
    }
public static void main(String args[]){
int num=5;
boolean res =isHappy(num);
System.out.println(res);
}

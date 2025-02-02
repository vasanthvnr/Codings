public class halfdiamond {
    public static void main(String[] args) {
        int num=13;
        for(int i=1;i<=num;i+=2){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //reverse the loops
        for(int i=num-2;i>=1;i-=2){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

}}

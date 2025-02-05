public class diamond {
    public static void main(String[] args) {
        int row =7;
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<row-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

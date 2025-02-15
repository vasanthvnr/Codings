public class braces_pattern {
    public static void main(String[] args) {
        String a="{";
        String b="}";
        int A=4;
        for (int i=1;i<A;i++){
            for (int j=1;j<i+1;j++){
                for (int k=j;k<=j;k++){
                    System.out.print(a);
                }
                for(int k=j;k<=j;k++){
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}

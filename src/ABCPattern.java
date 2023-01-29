public class ABCPattern {
    public static void main(String[] args){
        int res = 65;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++) {
                System.out.print((char)res+" ");
            }
            res=res+1;
            System.out.println();
        }

    }
}

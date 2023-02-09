public class ZeroOnePattern {
    public static void main(String[] args){
        int N=5;

        for(int i=1;i<=N;i++){
            int val=i%2;//1
            for(int j=0;j<i;j++){//
                System.out.print(val+" ");//0 1
                val=1-val;//0
            }
            System.out.println();
        }
    }
}

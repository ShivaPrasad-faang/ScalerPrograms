public class NumericFullPyramid {
    public static void main(String[] args){
        int N=5;
        for(int i=1;i<=N;i++){
            for(int j=0;j<N-i;j++){
                System.out.print(0+" ");
            }
          //  System.out.println();
            for(int j=0;j<i;j++){
                System.out.print((j+i)+" ");
            }
            for(int k=2*i-2;k>=i;k--){
                System.out.print(k+" ");
            }
            for(int j=0;j<N-i;j++){
                System.out.print(0+" ");
            }
            System.out.println();
        }
        }

}

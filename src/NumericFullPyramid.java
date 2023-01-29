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
            for(int j=(2*i)-2;j<i;j++){
                System.out.print(j+" ");
            }
            for(int j=0;j<N-i;j++){
                System.out.print(0+" ");
            }
            System.out.println();
        }
        }

}

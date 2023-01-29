public class PerfectSquareRoot {
    public static void main(String[] args){
        int Inp=5;

        for(int i=1;i*i<=Inp;i++){
            if(i*i==Inp){
              System.out.println(i);
              return;
            }
        }
        System.out.println(-1);
    }
}

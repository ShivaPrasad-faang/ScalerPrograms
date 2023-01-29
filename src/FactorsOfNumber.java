public class FactorsOfNumber {
    public static void main(String[] args){
        int Inp=24;
        int i=1;
        int sum=0;
        while(i<=Inp){
            if(Inp%i==0){
                sum=sum+1;
            }
            i++;
        }
        System.out.println(sum);
    }
}

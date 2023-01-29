public class SumOfDivisers {
    public static void main(String[] args){
        System.out.println(sumDiv(24));
    }
    public static int sumDiv(int Inp){
        int sum=0;
        for(int i=1;i*i<=Inp;i++){
            if(Inp%i==0){
                if(i*i==Inp){
                    sum=sum+i;
                }else{
                    sum=sum+i+Inp/i;
                }
            }
        }
        return sum;
    }
}

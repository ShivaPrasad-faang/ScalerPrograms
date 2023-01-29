public class ArmstrongNumber {
    public static void main(String[] args){
        int Inp=500;

        for(int i=1;i<=Inp;i++){
            int sum=0;
            int j=i;
            while(j>0){
                int digit=j%10;
                sum=sum+(digit*digit*digit);
                j=j/10;
            }
            if(sum==i){
              System.out.println(i);
            }
        }
    }
}

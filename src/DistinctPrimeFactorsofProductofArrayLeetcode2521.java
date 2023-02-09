public class DistinctPrimeFactorsofProductofArrayLeetcode2521 {
    public static void main(String[] args){
        int arr[]={2,14,19,19,5,13,18,10,15,20};
    System.out.println(distinctPrimeFactors(arr));
    }
    public static int distinctPrimeFactors(int[] nums) {
        int sum=1;
        for(int i=0;i<nums.length;i++){//2
            sum=sum*nums[i];//2
        }
        int cnt=0;
        for(int i=2;i*i<=sum;i++){//
            if((isPrime(i)==1) & (sum%i==0)) {
                cnt = cnt + 1;
            }
            while(sum%i==0){
                sum=sum/i;
            }

        }
        if(sum!=1){
            cnt=cnt+1;
        }
        return cnt;
    }
    public static int isPrime(int Inp){//10
        int i=2;
        int result=0;
        for(;i<Inp;i++){
            if(Inp%i==0){
                break;
            }
        }
        if(Inp==i) {
            result= 1;
        }
        return result;
    }
}

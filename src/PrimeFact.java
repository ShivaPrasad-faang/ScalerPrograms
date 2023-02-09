public class PrimeFact {
    public static void main(String[] args){
        int Inp=10080;
      //  System.out.println(1%4);
        //int sum=0;
        for(int i=2;i*i<=Inp;i++){//3
           // if(Inp%i==0){//2
                while(Inp%i==0){//1%4==0
                   System.out.println(i);//2+2+3+3
                    Inp=Inp/i;//3
                }
                //if(isPrime(i)==1) {
                 //   System.out.println(i);
                //}
          //  }
        }
        if(Inp!=1){
            System.out.println(Inp);
        }

        //System.out.println(isPrime(4));
    }

    static int isPrime(int Inp){//10
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

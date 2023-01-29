public class PrimeFact {
    public static void main(String[] args){
        int Inp=100;
      //  System.out.println(1%4);
        //int sum=0;
        for(int i=2;i*i<=Inp;i++){//4
           // if(Inp%i==0){//2
                while(Inp%i==0){//1%4==0
                   System.out.println(i);//2+2+3+3
                    Inp=Inp/i;//3
                }
          //  }
        }
        if(Inp!=1){
            System.out.println(Inp);
        }
    }
}

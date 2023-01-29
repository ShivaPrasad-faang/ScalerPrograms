public class RecurtionFibonacci {
    public static void main(String[] args){
//0,1,1,2,3,5,8,13,21,34,55,89
        System.out.println(IsFab(0));
        System.out.println(IsFab(1));
        System.out.println(IsFab(2));
    }
    public static int IsFab(int Inp){//4

        if(Inp==0 || Inp==1){
            return Inp;
        }else{
            return IsFab(Inp-1)+IsFab(Inp-2);//3+2
        }
    }
}

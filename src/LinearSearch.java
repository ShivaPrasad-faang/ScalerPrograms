public class LinearSearch {
    public static void main(String[] args){
        int[] A={1, 4, 3, 2};
        int B=5;
        System.out.println(LinerSer(A,B));
    }
    public static int LinerSer(int[] inp, int B){

        for(int i=0;i<inp.length;i++){
         if(inp[i]==B){
            return 1;
         }
        }
        return 0;
    }
}

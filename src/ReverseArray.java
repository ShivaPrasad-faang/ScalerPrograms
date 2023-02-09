public class ReverseArray {
    public static void main(String[] args){
        int[] inp={5,1,2,3,4};
        //int[] result=RevArray(inp);
        for(int x: RevArray(inp)){
            System.out.print(x+" ");
        }
    }
    public static int[] RevArray(int[] inp){
        int[] out=new int[inp.length];
        int j=0;
        for(int i=inp.length-1;i>=0;i--){
            out[j]=inp[i];
            j++;
        }
        return out;
    }
}

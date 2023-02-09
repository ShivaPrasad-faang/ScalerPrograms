public class NegativeElementsArray {
    public static void main(String[] args){
        int[] A={5,1,-5,2,-8,-4};
        int[] output=NegiArr(A);
        int k=0;
        while(output[k]!=0){
            System.out.print(output[k]);
            k++;
        }
    }
    public static int[] NegiArr(int[] inp){
        int[] Out=new int[inp.length+1];
        int j=0;
        int i=0;
        for(;i<inp.length;i++){
            if(inp[i]<1){
                Out[j]=inp[i];
                j++;
            }
        }
        if(i==inp.length){
            Out[j]=0;
        }
        return Out;
    }
}



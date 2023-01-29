public class ElectricityBill {
    public static void main(String[] args){
        int A=4;
        int bill=0;
        if(A>=50){//150>50
            bill= bill+(int) (50*0.50);//25
            A=A-50;//100
            //System.out.println(bill);
            if(A>=100){
                bill=bill+(int)(100*0.75);
               // System.out.println(bill);
                A=A-100;
                if(A>=100){
                    bill=bill+(int)(100*1.20);
                    A=A-100; //20
                    if(A>=250){
                            bill = bill + (int) (A * 1.50);
                        }
                }
                else{
                    bill=bill+(int)(A*1.20);
                }
            }
            else{
                bill=bill+(int)(A*0.75);
            }
        }else{
            bill=bill+(int)(A*0.50);
        }
        System.out.println((int)(bill+bill*0.20));
    }
}

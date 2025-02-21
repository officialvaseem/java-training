public class Contractimplement implements Contract,Contract1 {
    public static void main(String[] args) {
        Contractimplement ci=new Contractimplement();
        Contract.print();
        ci.calculate(100, 2);
        
    }
    @Override
    public void calculate(int a,int b){
        //System.out.println(a*b);
        Contract.super.calculate(a, b);
        Contract1.super.calculate(a, b);
    }
    public void result(){
        System.out.println("result is today");
    }

    
}

package tamilnadu.kerela;

public class Branch_office2 extends Office{
    Branch_office2()
    {
        System.out.println("welcome to Branch_Office2");
    }
    public static void main(String[] args) {
        Branch_office2 bff2=new Branch_office2();
        bff2.promoted();
        bff2.recruit();
    }
    void promoted()
    {
        System.out.println("got promotion");
    }
    
}

package tamilnadu.chennai;

public class Branch_office extends Office {
    public Branch_office()
    {
        System.out.println("Welcome to Branch_office");
    }
    public static void main(String[] args) {
        Branch_office bff=new Branch_office();
        bff.celebrate_local_function();
        bff.work();
    }
    void celebrate_local_function()
    {
        System.out.println("celebrating");
    }
}

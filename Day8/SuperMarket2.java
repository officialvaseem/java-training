public class SuperMarket {
    String name;
    String pname;
    int price;
    int discount;
    //  global variables,non-static,fields
    public static void main(String[] args) {
        int a=20;
        SuperMarket product1=new SuperMarket();//it is an object creation
        product1.pname="Strawberry";
        product1.price=50;
        product1.discount=5;
        System.out.println(product1.name);

        SuperMarket product2=new SuperMarket();
        product1.pname="Banana";
        product1.price=50;
        product1.discount=5;
        System.out.println(product2.name);

        //System.out.println(pname);




    }
}

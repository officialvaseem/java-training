public class Array3Maxelement {
    public static void main(String[] args) {
        int a[]={4,1,2,6,3};
        int max=a[0]; // considering as maximum element
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

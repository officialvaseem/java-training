public class ArrayRotate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int d=2;
        for(int i=0;i<d;i++){
            int first=a[0];
            for(int j=0;j<=a.length;j++){
                a[j]=a[j+1];
            }
            a[a.length-1] = first;
        }
        
        

    }
}

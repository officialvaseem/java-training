public class Swapelements {
    public static void swap(int[]arr,int index1,int index2)
    {
        if(index1<0||index2<0||index1>=arr.length||index2>=arr.length)
        {
            System.out.println("Invalid indices for swapping");
            return;
        }
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println("The array after swapping is:");
        for(int num:arr){
            System.out.println(num+"");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int index1=1,index2=3;
        swap(arr,index1,index2);
    }
}

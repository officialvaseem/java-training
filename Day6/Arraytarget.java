public class Arraytarget {
    public static void main(String[] args) {
        int nums[]={2,7,11,5};
        int target=8;
        int res[]=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;

                    break;
                }
                
                
            }
        }
    }   
}      
        

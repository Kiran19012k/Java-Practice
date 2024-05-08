public class Linear {
    public static void main(String[] args) {
        int nums[]={3 ,6 ,2,9};
        int target=9;
        int result=LinearSearch(nums,target);

        if(result!=-1)
        {
            System.out.println("index of "+target+" is "+result);
        }
        else
            System.out.println("not found");
        
    }

    public static int LinearSearch(int[] nums, int target) {

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                return i;
            
        }
        return -1;
    }
    
}

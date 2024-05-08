public class Binary {
    public static void main(String[] args) {
        
        int nums[] ={1,6,4,8,2,24,95,36};
        int target=95;
        

        int result=BinarySearch(nums, target);

        if(result!=-1)
        {
            System.out.println(" ");
            System.out.println(target+" is found At index : "+result);
        }
        else    
            System.out.println("not found");
    }
    public static int BinarySearch(int nums[],int target)
    {
            for(int i=0;i<nums.length;i++)
            {
                for(int j=0;j<nums.length-1;j++)
                {
                    if(nums[j]>nums[j+1])
                    {
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
            System.out.println("sorted array");
            for(int n:nums)
            {
                System.out.print(n+" ");
            }

        int left=0;
        int right=nums.length-1;

        while(left<=right)
        {
            int mid=(left+right)/2;

            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                left= mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
    
}

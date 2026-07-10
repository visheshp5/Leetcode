class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int n=nums.length;
        int[] copy=new int[n];
        for(int i=0;i<n;i++)copy[i]=nums[i];
        Arrays.sort(copy);
        for(int i=0;i<n;i++){
            int in=-1;
            int a=0;
            int b=n-1;
            while(a<=b){
                int mid=(a+b)/2;
                if(nums[i]==copy[mid]){
                    in=mid;
                    b=mid-1;
                }
                else if(copy[mid]>nums[i])b=mid-1;
                else a=mid+1;
            }
            ans[i]=in;
        }
        return ans;
    }
}
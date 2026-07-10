class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a=0;
        int b=nums.length-1;
        int i=0;
        while(i<b&&a<b){
            if(nums[i]%2==0){
                if(a==i){
                    a++;
                    i++;
                    continue;
                }
                int temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                a++;
            }
            else{
                int temp=nums[b];
                nums[b]=nums[i];
                nums[i]=temp;
                b--;
            }
        }
        return nums;
    }
}
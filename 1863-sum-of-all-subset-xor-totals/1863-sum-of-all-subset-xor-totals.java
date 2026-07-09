class Solution {
    int t=0;
    public int subsetXORSum(int[] nums) {
        xor(nums,0,0);
        return t;
    }
    public  void xor(int[] nums,int in,int x){
        t+=x;
        System.out.println(x);
        for(int i=in;i<nums.length;i++){
            xor(nums,i+1,x^nums[i]);
        }
    }
}
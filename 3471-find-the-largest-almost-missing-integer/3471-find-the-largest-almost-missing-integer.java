class Solution {
    public int largestInteger(int[] nums, int k) {
        int l=0;
        int n=nums.length;
        int in=0;
        int ls=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            l=Math.max(nums[i],l);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(nums[i]==nums[0])in++;
            if(nums[i]==nums[n-1])ls++;
        }    
        if(k==n)return l;
        else if(k==1){
            int max=-1;
            for(int key:map.keySet()){
                if(map.get(key)==1)max=Math.max(max,key);
            }
            return max;
        }
        else{
            if(in==1&&ls==1)return Math.max(nums[0],nums[n-1]);
            else if(in>1&&ls>1)return -1;
            else if(ls>1)return nums[0];
            else return nums[n-1];
        }
    }
}
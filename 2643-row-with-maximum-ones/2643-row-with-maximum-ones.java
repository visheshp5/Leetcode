class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans=new int[2];
        ans[0]=0;
        ans[1]=0;
        for(int i=0;i<mat.length;i++){
            int temp=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    temp++;
                    if(temp>ans[1]){
                        ans[1]=temp;
                        ans[0]=i;
                    }
                }
            }
        }
        return ans;
        
    }
}
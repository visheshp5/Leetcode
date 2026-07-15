class Solution {
    public int gcdOfOddEvenSums(int n) {
        int os=0;
        int es=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0)es+=i;
            else os+=i;
        }
        int ans=0;
        for(int i=Math.min(os,es);i>=1;i--){
            if(os%i==0&&es%i==0){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
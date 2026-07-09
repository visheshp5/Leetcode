class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)sum+=arr[i];
        for(int l=3;l<=arr.length;l+=2){
            for(int i=0;i<=arr.length-l;i++){
                for(int j=i;j<i+l;j++){
                    sum+=arr[j];
                }
            }
        }
        return sum;
    }
}
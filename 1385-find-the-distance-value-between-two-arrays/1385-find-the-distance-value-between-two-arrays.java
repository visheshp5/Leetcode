class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int t=0;
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            int a=0;
            int b=arr2.length-1;
            while(a<=b){
                int mid=(a+b)/2;
                int diff=Math.abs(arr1[i]-arr2[mid]);
                if(diff<=d){
                    a=-1;
                    break;
                }
                if(arr2[mid]>arr1[i])b=mid-1;
                else a=mid+1;
            }
            if(a!=-1)t++;

        }
        return t;
    }
}
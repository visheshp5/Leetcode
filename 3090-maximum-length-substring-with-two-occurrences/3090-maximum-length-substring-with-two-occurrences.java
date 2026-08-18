class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[] ar=new int[26];
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                ar[c-'a']++;
                if(ar[c-'a']>2)break;
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
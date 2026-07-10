class Solution {
    public int binaryGap(int n) {
        int d=0;
        int max=0;
        int p=0;
        boolean flag=false;
        while(n>0){
            if(n%2==1&&flag){
                max=Math.max(max,p-d);
                d=p;
            }
            else if(n%2==1&&flag==false){
                d=p;
                flag=true;
            }
            n/=2;
            p++;
        }
        return max;
    }
}
class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int in=0;
        int f=x/2;
        int n=0;
        while(in<=f){
            int mid=(in+f)/2;
            long r=(long)mid*mid;
            if(r==x) return mid;
            else if(r>x) f=mid-1;
            else {
                n=mid;
                in=mid+1;

            }
        }
        return n;
        
    }
}
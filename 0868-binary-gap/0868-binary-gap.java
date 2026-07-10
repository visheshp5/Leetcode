class Solution {
    public int binaryGap(int n) {
        int d=0;
        int max=0;
        boolean flag=false;
        StringBuilder s=new StringBuilder();
        while(n>0){
            s.append(n%2);
            n/=2;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'&&flag){
                max=Math.max(max,i-d);
                d=i;
            }
            else if(s.charAt(i)=='1'&&flag==false){
                d=i;
                flag=true;
            }
        }
        return max;
    }
}
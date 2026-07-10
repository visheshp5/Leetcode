class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int ans=0;
        StringBuilder s=new StringBuilder();
        int d=0;
        while(n>0){
            s.append(n%2);
            n/=2;
        }
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            c=c^1;
            ans+=Math.pow(2,d)*c;
            
            d++;
        }
        
        return ans;
        
    }
}
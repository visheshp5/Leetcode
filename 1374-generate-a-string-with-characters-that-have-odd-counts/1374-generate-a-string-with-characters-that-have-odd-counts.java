class Solution {
    public String generateTheString(int n) {
        StringBuilder s=new StringBuilder();
        if(n%2==1){
            while(n-->0)s.append('a');
            return s.toString();
        }
        for(int i=1;i<=n-1;i++){
            s.append('a');
        }
        s.append('b');
        return s.toString();
    }
}
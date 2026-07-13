class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int t1=0;
        int t2=0;
        int m=3600;
        String[] a=startTime.split(":");
        String[] b=endTime.split(":");
        for(int i=0;i<a.length;i++){
            int tmp=Integer.parseInt(a[i]);
            int tm2=Integer.parseInt(b[i]);
            t1+=tmp*m;
            t2+=tm2*m;
            m/=60;
        }
        return Math.abs(t1-t2);
    }
}
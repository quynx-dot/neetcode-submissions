class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] pM=new int[n];
        int []sM=new int[n];
        for(int i=1;i<n;i++){
            pM[i]=Math.max(pM[i-1],height[i-1]);
        }
         for(int i=n-2;i>=0;i--){
            sM[i]=Math.max(sM[i+1],height[i+1]);
        }
        int answer=0;
        for(int i=0;i<n;i++){
            int x=Math.min(pM[i],sM[i]);
            if((x-height[i])>=0){
            answer+=x-height[i];
            }
        }
        return answer;
    }
}

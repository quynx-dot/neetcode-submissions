class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0)return 0;
        int[] pM=new int[n];
        int[] sM=new int[n];
                pM[0] = height[0];
                        sM[n - 1] = height[n - 1];


        for(int i=1;i<n;i++){
            pM[i]=Math.max(pM[i-1],height[i]);
        }
         for(int i=n-2;i>=0;i--){
            sM[i]=Math.max(sM[i+1],height[i]);
        }
        int answer=0;
        for(int i=0;i<n;i++){
           
            answer+=Math.max(0,Math.min(pM[i],sM[i])-height[i]);
            
        }
        return answer;
    }
}

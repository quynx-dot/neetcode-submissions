class Solution {
    public int maxArea(int[] heights) {
        int answer=0;
        int n= heights.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        int r=n-1;

        while(l<r){
            int curr=1;
            int h=Math.min(heights[l], heights[r]);
            int w=r-l;
            curr=h*w;
            answer=Math.max(answer, curr);
            if(heights[l]<=heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return answer;
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Deque<Integer>stack=new ArrayDeque<>();
        int maxArea=0;
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() &&(i==n ||heights[stack.peek()]>=heights[i])){
                int height=heights[stack.pop()];
                int left=stack.isEmpty()?-1:stack.peek();
                int width=i-1-left;

                maxArea=Math.max(maxArea,height*width);
            }
            stack.push(i);
        }
        return maxArea;

    }
}

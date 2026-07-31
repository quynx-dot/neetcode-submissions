class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] answer=new int[n];
        Stack<Integer>s=new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int index=s.pop();
                answer[index]=i-index;
            }
            s.push(i);
        }
        return answer;
    }
}

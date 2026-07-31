class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        for(int i=0;i<k;++i){
            count+=blocks.charAt(i)=='W'?1:0;
        }
        int answer=count;
        for(int i=k;i<blocks.length()-1;++i){
            count+=blocks.charAt(i)=='W'?1:0;
            count-=blocks.charAt(i-k)=='W'?1:0;
            answer=Math.min(answer,count);
            }
        return answer;
    }
}
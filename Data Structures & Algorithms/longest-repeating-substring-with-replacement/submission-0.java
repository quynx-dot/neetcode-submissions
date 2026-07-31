class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int left=0;
        int maxFrequency=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            int curr=s.charAt(right)-'A';
            count[curr]++;
            maxFrequency=Math.max(maxFrequency,count[curr]);
            if(right-left+1-maxFrequency>k){
                int leftIndex=s.charAt(left)-'A';
                count[leftIndex]--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}

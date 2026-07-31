class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;
        int n=customers.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
                int additional=0;
        for(int i=0;i<minutes;i++){
           if(grumpy[i]==1){
            additional+=customers[i];
           }
        }
        int maxAdditional=additional;
        for(int i=minutes;i<n;i++){
            if(grumpy[i]==1){
                additional+=customers[i];
            }
            if(grumpy[i-minutes]==1){
                additional-=customers[i-minutes];
            }
            maxAdditional=Math.max(additional,maxAdditional);
        }
        return satisfied+maxAdditional;
    }
}
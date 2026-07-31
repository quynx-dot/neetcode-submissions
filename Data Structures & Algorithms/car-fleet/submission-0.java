class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] timeToTarget=new double[target];
        for(int i=0;i<position.length;i++){
            timeToTarget[position[i]]=(double)(target-position[i])/speed[i];
        }
            int fleets=0;
            double maxTime=0;
            for(int i =target-1;i>=0;i--){
                if(timeToTarget[i]>maxTime){
                    fleets++;
                    maxTime=timeToTarget[i];
                }
            }
            return fleets;
        
    }
}

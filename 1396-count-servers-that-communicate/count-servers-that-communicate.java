class Solution {
    public int countServers(int[][] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int mcount=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j]==1){
                    int count=0;

                    for(int k=0; k<nums[0].length; k++){
                        if(nums[i][k]==1){
                            count++;
                        }
                    }

                    int count1=0;
                    for(int k=0; k<nums.length; k++){
                        if(nums[k][j]==1){
                            count1++;
                        }
                    }
                    if(count>1 || count1>1){
                        mcount++;
                    }
                }
            }
        }
        return mcount;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> mainList = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int first = i + 1;
            int last = nums.length - 1;
            while(first < last){
                int sum = nums[i]+ nums[first] + nums[last];
                if(sum == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]); list.add(nums[first]); list.add(nums[last]);
                    if(!(mainList.contains(list))){
                        mainList.add(new ArrayList<>(Arrays.asList(nums[i], nums[first], nums[last])));
                    }
                    first++;
                }else if(sum > 0){
                    last--;
                }else{
                    first++;
                }
            }
        }
        List<List<Integer>> List = new ArrayList<>(mainList);
        return List;
    }
}
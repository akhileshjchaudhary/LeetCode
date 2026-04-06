class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> nList = new ArrayList<>();
        List<Integer> pList = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {
            if (nums[i] < 0) {
                nList.add(nums[i] * nums[i]);
                i++;
            }else{
                break;
            }
        }

        while (i < nums.length) {
            pList.add(nums[i] * nums[i]);
            i++;
        }

        int j = nList.size() - 1, k = 0, l = 0;
        while (j >= 0 && k < pList.size() && l < nums.length) {
            if (nList.get(j) <= pList.get(k)) {
                nums[l] = nList.get(j);
                l++;
                j--;
            } else {
                nums[l] = pList.get(k);
                l++;
                k++;
            }
        }

        while (j >= 0 && l < nums.length) {
            nums[l] = nList.get(j);
            j--;
            l++;
        }

        while (k < pList.size() && l < nums.length) {
            nums[l] = pList.get(k);
            k++;
            l++;
        }

        return nums;
    }
}
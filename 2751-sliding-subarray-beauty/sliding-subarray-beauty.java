class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int ans[] = new int[nums.length - k + 1];
        int m = 0, startIndx = 0;
        int arr[] = new int[51];

        //First window formation
        for (int i = 0; i < k; i++) {
            if (nums[i] < 0) {
                arr[nums[i] + 50]++;
            }
        }

        int b = xThSmallestElement(arr, x);
        ans[m] = b;
        m++;

        for (int i = k; i < nums.length; i++) {
            if (nums[startIndx] < 0) {
                arr[nums[startIndx] + 50]--;
            }
            startIndx++;

            if (nums[i] < 0) {
                arr[nums[i] + 50]++;
            }

            int c = xThSmallestElement(arr, x);
            ans[m] = c;
            m++;
        }
        return ans;
    }

    private int xThSmallestElement(int arr[], int x) {
        int count = 0;
        int i = 0;
        boolean flag = false;
        for (; i < arr.length; i++) {
            if (count >= x) {
                flag = true;
                break;
            }
            if (arr[i] > 0) {
                count += arr[i];
            }
        }
        if (flag == false) {
            return 0;
        }
        return i - 50 - 1;
    }
}
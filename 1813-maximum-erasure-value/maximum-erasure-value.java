class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length ;
        int left = 0, right = 0;
        int sum = 0, max = 0;
        while (right < n) {
            if (!set.contains(nums[right])) {
                set.add(nums[right]);
                sum += nums[right];
                max = Math.max(max, sum);
                right++;
            } else {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return max;
    }
}
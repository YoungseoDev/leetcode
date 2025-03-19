class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();

        int left = 0;
        int right = nums.length - 1;
        int list_number = 0;
        int standard = 0;
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            standard = nums[i];
            left = i + 1;
            right = nums.length - 1;

            while (left < right) {
                sum = nums[left] + nums[right] + standard;
                if (sum == 0) {
                    answer.add(new ArrayList<>(Arrays.asList(standard, nums[left], nums[right])));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else { // sum > 0
                    right--;
                }
            }

        }

        return new ArrayList<>(answer);
    }
}
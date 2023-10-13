// Idea. Sets J to 1 and then loop thru elements.
// If the elements are unique, increment the counter value (j)
// nums[j] represents the unique numbers
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

//Original Solution i came up with.
//Takes 2 variables count and maxno to find the max number.
// Converts the array into a list to use the Collections operation
// Overall Efficiency is O(n^2)
class simpleSolution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int maxno = 0;
        
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
        for(int number: nums){
            int currcount = Collections.frequency(numList, number);
            if (currcount > (nums.length / 2) && currcount > count) {
                maxno = number;
                count = currcount;
            }
        }
        return maxno;
    }
}



//Optimal Solution using Moore's voting algorithm'
//runs in O(n) time and O(1) space
class optimalSolution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}

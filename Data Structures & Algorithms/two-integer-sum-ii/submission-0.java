class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //sorted in ascending order
        //1-indexed 1,2,3,4,5,6...
        //add up to target 
        //index 1 < index 2
        //cant use the same element 2 times
        
        //two pointer solution
        boolean soln_found = false;
        int j = numbers.length - 1;
        for(int i = 0; i < numbers.length; ){
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{};
    }
}

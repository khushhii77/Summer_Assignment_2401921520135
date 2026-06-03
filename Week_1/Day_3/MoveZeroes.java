// Topic: Two Pointer
// Description: Move all zeroes to the end while maintaining the order of non-zero elements.
// Approach: We Place non-zero elements at the front and fill remaining positions with zeroes.
// Time Complexity: O(n)
//Space com: O(1)

class Solution {
   public static void moveZeroes(int[] nums) {

        int n = nums.length;
        int j = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
                count++;
            }
        }

        for(int i = count; i < n; i++){
            nums[i] = 0;
        }
     
   }
}

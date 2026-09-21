class Solution {
    public int search(int[] nums, int target) {
          return binary_search(0, nums.length - 1, nums, target);
    }

    public int binary_search(int l, int r, int[] nums, int target){
        if(l > r) return -1;
        int m = l + (r - l)/2;
        if(nums[m] == target) return m;
        if(nums[m] < target){
            return binary_search(m + 1, r, nums, target);
        }
        else{
             return binary_search(l, r-1, nums, target);
        }
    }
}

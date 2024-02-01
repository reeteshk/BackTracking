class Solution {

   List<List<Integer>> result = new ArrayList<>();
   public List<List<Integer>> subsets(int[] nums) {
       helper(nums, new ArrayList<Integer>(),0);
       return result;
   }

   public void helper (int[] nums, List<Integer> temp, int start){
       result.add(new ArrayList<>(temp));
       for(int i = start; i < nums.length; i++){
           temp.add(nums[i]);
           helper(nums, temp, i+1);
           temp.remove(temp.size() -1);
       }
   }

}
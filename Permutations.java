class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
            ans = new ArrayList<>();

            List<Integer> al = new ArrayList<>();
            backTracking(nums,al);
            return ans;
    }
    public static void backTracking(int nums[],List<Integer> al)
    {
        if(al.size() == nums.length)
        {
            ans.add(new ArrayList<>(al));
            return;
        }

    
        for(int i=0;i<nums.length;i++)
        {
            if(al.contains(nums[i])) continue;
            al.add(nums[i]);
            backTracking(nums,al);
            al.remove(al.size()-1);
        }
    }
}
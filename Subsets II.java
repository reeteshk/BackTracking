class Solution {
    static List<List<Integer>>ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer>temp=new ArrayList<>();
        subsetsHelper(nums,0,temp);
        return ans;
    }
    public static void subsetsHelper(int nums[], int n,List<Integer>temp)
    {
        if(n>=nums.length)
        {
            if(ans.contains(temp))
            {
                return;
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[n]);
        subsetsHelper(nums,n+1,temp);
        temp.remove(temp.size()-1);
        subsetsHelper(nums,n+1,temp);
        return;
    }
}
class Solution {

    List<List<String>>result;
    public List<List<String>> partition(String s) {
        result=new ArrayList<>();
        if(s==null || s.length()==0)
        {
            return result;
        }
        helper(s,0,new ArrayList<>());
        return result;
        
    }   
    private void helper(String s,int index,List<String>path)
    {
        //base
        if(index==s.length())
        {
            result.add(path);
            return;
        }
        //logic
        for(int i=index;i<s.length();i++)
        {
            String sb=s.substring(index,i+1);
            if(isPalindrome(sb))
            {
                //action
                List<String> temp=new ArrayList<>(path);
                temp.add(sb);
                helper(s,i+1,temp);
                //backtrack
            }
        }
    }
    public boolean isPalindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
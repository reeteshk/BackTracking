class Solution {
    //String value[]={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> result;
    public List<String> letterCombinations(String digits) {
            result=new ArrayList<>();
            if(digits.equals("") || digits==null)
            {
                return result;
            }
            int value=Integer.parseInt(digits);
            letterCombinations( value,"");
            return result;
        
    }
    public void letterCombinations(int digits,String ans)
    {
        if(digits==0)
        {
            result.add(ans);
            return;
        }
        String singleoutput[]=singleDigit(digits%10);
        for(int i=0;i<singleoutput.length;i++)
        {
            letterCombinations(digits/10,singleoutput[i]+ans);
        }

    }
    
    public static String[] singleDigit(int n)
    {
        if(n>10 || n<0)
        {
            return new String[0];
        }
        if(n==1)
        {
            return new String[0];
        }
        if(n==2)
        {
            return new String[]{"a","b","c"};
        }
        if(n==3)
        {
            return new String[]{"d","e","f"};
        }
        if(n==4)
        {
            return new String[]{"g","h","i"};
        }
        if(n==5)
        {
            return new String[]{"j","k","l"};
        }
        if(n==6)
        {
            return new String[]{"m","n","o"};
        }
        if(n==7)
        {
            return new String[]{"p","q","r","s"};
        }
        if(n==8)
        {
            return new String[]{"t","u","v"};
        }
        else
        {
            return new String[]{"w","x","y","z"};
        }
    }
}
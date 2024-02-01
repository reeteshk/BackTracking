class Solution {
    List<List<String>>result;
    
    public List<List<String>> solveNQueens(int n) {
        result=new ArrayList<>();
        if(n==0) return result;
        boolean [][]board=new boolean[n][n];
        backtrack(board,0,n);
        return result;

    }
    public void backtrack( boolean[][] board,int r,int n)
    {


        if(r==n)
        {
            List<String>li=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++)
                {   
                    if(board[i][j])
                    {
                            sb.append('Q');
                    }
                    else
                    {
                        sb.append('.');
                    }
                }
                li.add(sb.toString());
            }
            result.add(li);
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board,r,j,n))
            {
                //action
                board[r][j]=true;
                //recurse
                backtrack(board,r+1,n);
                //backtrack
                board[r][j]=false;
            }
        }
    }
    public boolean isSafe(boolean board[][],int r,int c,int n)
    {
            //up col
            for(int i=0;i<r;i++)
            {
                if(board[i][c]) return false;
            }
            //diagonal up left
            //while r--,c--
            int i=r;
            int j=c;
            while(i>=0 && j>=0)
            {
                if(board[i][j]) return false;
                i--;
                j--;
            }
             //diagonal up right
            //while r--,c--
            i=r;
            j=c;
            while(i>=0 && j<n)
            {
                if(board[i][j]) return false;
                i--;
                j++;
            }

            return true;
    }
}
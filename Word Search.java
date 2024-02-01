class Solution {
    public boolean exist(char[][] board, String word) {
        
        boolean visited[][] = new boolean[board.length][board[0].length];

        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0;j<board[0].length ;j++)
            {
                if(dfs(board,word,visited,i,j))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board , String word, boolean visited[][],int i,int j)
    {

        if(i<0 || i >= board.length || j<0 || j >= board[0].length || visited[i][j] == true) return false;

        int xdir[] = new int[]{1,0,-1,0};
        int ydir[] = new int[]{0,-1,0,1};

        if(word.charAt(0) == board[i][j])
        {
            if(word.length() == 1) return true;
            visited[i][j] = true;
            for(int t=0;t<4;t++)
            {
                int xx = xdir[t] + i;
                int yy = ydir[t] + j;
                if(dfs(board,word.substring(1),visited,xx,yy)) return true;
            }
            visited[i][j] = false;
        }
        return false;
    }
}
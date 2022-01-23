class Solution {
    public void rotate(int[][] matrix) {
        
        int i,j,t,e;
        
        for(i=0;i<matrix.length;i++)
        {
            for(j=i;j<matrix.length;j++)
            {
                t=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=t;
            }
            
        }
        
        e=matrix.length-1;
        
        for(i=0;i<e;i++)
        {
            for(j=0;j<matrix.length;j++)
            {
                t=matrix[j][i];
                matrix[j][i]=matrix[j][e];
                matrix[j][e]=t;
            }
            e=e-1;
        }
        
        
    }
}
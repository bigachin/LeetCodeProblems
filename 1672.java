class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum1=0;
        int sum2 =0;
        for(int x=0;x<accounts[0].length;x++){
            sum1+= accounts[0][x];
        }
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum2+= accounts[i][j];
            }
            if(sum1<sum2){
                sum1=sum2;
            }
            sum2 = 0;
        }
        return sum1;
        
    }
}
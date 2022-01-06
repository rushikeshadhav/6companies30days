class Solution {
  public:
    long long squaresInChessBoard(long long N) {
        // code here
        long long ans = 0;
        
        while(N>=1){
            ans += N * N;
            N--;
        }
        return ans;
    }
};

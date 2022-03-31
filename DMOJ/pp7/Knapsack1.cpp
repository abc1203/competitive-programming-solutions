#include <iostream>

using namespace std;

int main()
{
    int N, W;
    cin >> N; cin >> W;
    int weight[N]; long values[N];
    
    for(int i = 0; i < N; i++) {
        cin >> weight[i];
        cin >> values[i];
    }
    
   long dp[W + 1];
   
   for(int j = 0; j <= W; j++) {
       dp[j] = 0;
   }
   
   for(int i = 1; i <= N; i++) {
       for(int j = W; j >= 1; j--) {
           long current = dp[j];
           long proposed = 0;
           
           int weightOfItem = weight[i - 1];
           
           if(j >= weightOfItem) {
               proposed = values[i - 1] + dp[j - weightOfItem];
           }
           
           dp[j] = max(current, proposed);
       }
   }
    
    cout << dp[W] << endl;
}

#include <iostream>

using namespace std;


int main()
{
    int x, n;
    cin >> x; cin >> n;
    
    int dp[x + 1];
    
    dp[0] = 0;
    for(int i = 1; i <= x; i++) {
        dp[i] = 10000;
    }
    
    for(int i = 0; i < n; i++) {
        int denomination;
        cin >> denomination;
        
        for(int j = denomination; j <= x; j++) {
            dp[j] = min(dp[j], dp[j - denomination] + 1);
        }
    }
    
    cout << dp[x] << endl;
}

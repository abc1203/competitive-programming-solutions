#include <iostream>

using namespace std;


int main()
{
    int N, V;
    cin >> N; cin >> V;
    
    int dp[10001];
    dp[0] = 0;
    for(int i = 1; i <= 10000; i++) {
        dp[i] = 100000;
    }
    
    int coins[N + 1];
    for(int i = 1; i <= N; i++) {
        cin >> coins[i];
    }
    
    int givens[V][2];
    int minNumber[V];

    for(int i = 0; i < V; i++) {
        cin >> givens[i][0];
        cin >> givens[i][1];
    }
    
    for(int i = 1; i <= N; i++) {
        for(int j = coins[i]; j <= 10000; j++) {
            dp[j] = min(dp[j], dp[j - coins[i]] + 1);
        }
        
        for(int j = 0; j < V; j++) {
            if(givens[j][1] == i) {
                minNumber[j] = dp[givens[j][0]];
            }
        }
    }
    
    for(int i = 0; i < V; i++) {
        if(minNumber[i] == 100000) {
            cout << -1 << endl;
        } else {
            cout << minNumber[i] << endl;
        }
    }
}

#include <iostream>

using namespace std;

int dp[1000][1000];

int numberOfWays(int n, int k) {
    if(n < 0 || (k == 0 && n > 0)) {
        return 0;
    }

    if(n == 0 && k > 0) {
        return 1;
    }
    
    if(dp[n][k] == 0) {
        dp[n][k] = numberOfWays(n - k, k) + numberOfWays(n, k - 1);
    }
    
    return dp[n][k];
}


int main() {
    int n, k;
    cin >> n; cin >> k;
    
    cout << numberOfWays(n - k, k) << endl;
    
}

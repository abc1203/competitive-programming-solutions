#include <iostream>

using namespace std;


int main()
{
    int N, T;
    cin >> N; cin >> T;
    
    int values[N]; int times[N];
    
    for(int i = 0; i < N; i++) {
        cin >> values[i];
        cin >> times[i];
    }
    
    int dp[N + 1][T + 1];
    
    for(int i = 0; i <= N; i++) {
        dp[i][0] = 0;
    }
    for(int j = 0; j <= T; j++) {
        dp[0][j] = 0;
    }
    
    for(int i = 1; i <= N; i++) {
        for(int j = 1; j <= T; j++) {
           int profit1 = 0; int profit2 = 0;
           
           if(j >= times[i - 1]) {
               profit1 = values[i - 1] + dp[i - 1][j - times[i - 1]];
           }
           profit2 = dp[i - 1][j];
           
           dp[i][j] = max(profit1, profit2);
        }
    }
    
    cout << dp[N][T] << endl;
}

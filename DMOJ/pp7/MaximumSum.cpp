#include <iostream>

using namespace std;


int main()
{
    int N; cin >> N;
    int nums[N + 1];
    
    for(int i = 1; i <= N; i++) {
        cin >> nums[i];
    }
    
    int dp[N + 1];
    dp[0] = 0; dp[1] = nums[1];
    
    for(int i = 2; i <= N; i++) {
        dp[i] = max(nums[i] + dp[i - 2], dp[i - 1]);
    }
    
    cout << dp[N] << endl;
}

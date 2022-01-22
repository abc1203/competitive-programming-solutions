#include <iostream>

using namespace std;


int main()
{
    int distance, numOfClubs;
    cin >> distance;
    cin >> numOfClubs;
    
    int dp[distance + 1];
    
    dp[0] = 0;
    for(int i = 1; i <= distance; i++) {
        dp[i] = 10000;
    }
    
    
    for(int j = 0; j < numOfClubs; j++) {
        int clubDistance;
        cin >> clubDistance;
        
        for(int k = clubDistance; k <= distance; k++) {
            dp[k] = min(dp[k], dp[k - clubDistance] + 1);
        }
    }
    
    if(dp[distance] == 10000) {
        cout << "Roberta acknowledges defeat." << endl;
    } else {
        cout << "Roberta wins in " << dp[distance] << " strokes." << endl;
    }
}

#include <iostream>

using namespace std;

int main()
{
    int M, N, K;
    cin >> M; cin >> N; cin >> K;
    
    int x[M]; int y[N];
    int sumX = 0; int sumY = 0;
    int ans;
    
    for(int i = 0; i < M; i++) {
        x[i] = 0;
    }
    for(int i = 0; i < N; i++) {
        y[i] = 0;
    }
    
    for(int i = 0; i < K; i++) {
        char choice; int position;
        cin >> choice >> position;
        
        if(choice == 'R') {
            x[position - 1]++;
        } else {
            y[position - 1]++;
        }
    }
     
    for(int i = 0; i < M; i++) {
        sumX += (x[i] % 2);
    }
    for(int i = 0; i < N; i++) {
        sumY += (y[i] % 2);
    }
    
    ans = sumX * N + sumY * M - 2 * sumX * sumY;
    
    cout << ans << endl;
}

#include <iostream>

using namespace std;

int main()
{
    int N, Q;
    cin >> N;
    cin >> Q;
    
    int ratingSum[N];
    int calculatedSums[Q];
    
    for(int i = 0; i < N; i++) {
        int rating;
        cin >> rating;
        
        if(i == 0) {
            ratingSum[i] = rating;
        } else {
            ratingSum[i] = ratingSum[i - 1] + rating;
        }
    }
    
    for(int i = 0; i < Q; i++) {
        int a, b;
        cin >> a;
        cin >> b;
        a--;
        b--;
        
        if(a == 0) {
            calculatedSums[i] = ratingSum[N - 1] - ratingSum[b];
        } else {
            calculatedSums[i] = ratingSum[N - 1] - (ratingSum[b] - ratingSum[a - 1]);
        }
    }
    
    for(int i = 0; i < Q; i++) {
        //cout << ratingSum[i] << endl;
        cout << calculatedSums[i] << endl;
    }
}

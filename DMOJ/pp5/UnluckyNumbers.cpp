#include <iostream>

using namespace std;

int main()
{
    int unluckyNumbers[1000001];
    
    for(int i = 0; i < 1000001; i++) {
        unluckyNumbers[i] = 0;
    }
    
    int K, N;
    cin >> K;
    
    for(int i = 0; i < K; i++) {
        int unluckyNum;
        cin >> unluckyNum;
        
        unluckyNumbers[unluckyNum] = 1;
    }
    
    for(int i = 1; i < 1000001; i++) {
        unluckyNumbers[i] += unluckyNumbers[i - 1];
    }
    
    cin >> N;
    int totalFloors[N];
    
    for(int i = 0; i < N; i++) {
        int floorNumber;
        cin >> floorNumber;
        
        totalFloors[i] = floorNumber - unluckyNumbers[floorNumber];
    }
    
    for(int i = 0; i < N; i++) {
        cout << totalFloors[i] << endl;
    }
}

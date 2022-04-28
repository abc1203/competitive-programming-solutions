#include <iostream>

using namespace std;

int main()
{
    int N, Q;
    cin >> N;
    int sumOfMass[N];
    
    for(int i = 0; i < N; i++) {
        int mass;
        cin >> mass;
        
        if(i == 0) {
            sumOfMass[i] = mass;
        } else {
            sumOfMass[i] = sumOfMass[i - 1] + mass;
        }
    }
    
    cin >> Q;
    int querries[Q];
    
    for(int i = 0; i < Q; i++) {
        int a, b;
        cin >> a;
        cin >> b;
        
        if(a == 0) {
            querries[i] = sumOfMass[b];
        } else {
            querries[i] = sumOfMass[b] - sumOfMass[a - 1];
        }
    }
    
    for(int i = 0; i < Q; i++) {
        cout << querries[i] << endl;
    }
}

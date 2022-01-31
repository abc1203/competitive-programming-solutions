#include <iostream>

using namespace std;

int main()
{
    int N;
    cin >> N;
    int reversedSum[N];
    
    for(int i = 0; i < N; i++) {
        reversedSum[i] = 0;
    }
    
    for(int i = 0; i < N; i++) {
        int a, b;
        int reverseA = 0, reverseB = 0, reverseSum = 0;
        int remainder1 = 0, remainder2 = 0, remainderSum = 0;
        cin >> a; cin >> b;
        
        while(a != 0) {    
            remainder1 = a % 10;      
            reverseA = reverseA * 10 + remainder1;    
            a /= 10;    
        }
        
        while(b != 0) {    
            remainder2 = b % 10;      
            reverseB = reverseB * 10 + remainder2;    
            b /= 10;    
        }
        
        int sum = reverseA + reverseB;
        
        while(sum != 0) {
            remainderSum = sum % 10;
            reverseSum = reverseSum * 10 + remainderSum;
            sum /= 10;
        }
        
        reversedSum[i] = reverseSum;
    }
    
    for(int i = 0; i < N; i++) {
        cout << reversedSum[i] << endl;
    }
}
